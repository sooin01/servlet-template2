package com.my.app.common.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.my.app.common.dao.CommonSqlMapClient;

public class EchoProcess extends Thread {

	private DatagramSocket socket;

	private DatagramPacket packet;

	private byte[] buf;

	public EchoProcess(DatagramSocket socket, DatagramPacket packet, byte[] buf) {
		this.socket = socket;
		this.packet = packet;
		this.buf = buf;
	}

	@Override
	public void run() {
		// JsonBean jsonBean = new Gson().fromJson(received, JsonBean.class);

		try {
			String date = new SimpleDateFormat("HH:mm:ss").format(new Date());
			String received = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
			System.out.println(date + " " + packet.getAddress() + " Receive message: " + received.trim());

			// DB 작업
			SqlMapClient sqlMapClient = CommonSqlMapClient.getSqlMapClient();
			List list = sqlMapClient.queryForList("User.getUser");

			// 클라이언트에 응답 필요없으면 아래 2줄 제거
			packet = new DatagramPacket(buf, buf.length, packet.getAddress(), packet.getPort());
			socket.send(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
