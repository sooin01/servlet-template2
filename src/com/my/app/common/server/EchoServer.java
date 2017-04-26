package com.my.app.common.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class EchoServer extends Thread {

	private DatagramSocket socket;
	private EchoProcess echoProcess = EchoProcess.getInstance();

	public EchoServer() throws SocketException {
		socket = new DatagramSocket(4445);
	}

	@Override
	public void run() {
		byte[] buf = new byte[1024]; // 64000 바이트 (64kb)

		while (true) {
			try {
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);

				System.out.println("Echo server waiting.");
				socket.receive(packet);

				String received = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
				System.out.println(packet.getAddress() + " Receive message: " + received.trim());

				// 비즈니스 처리
//				echoProcess.process(received);

				// 클라이언트에 응답 필요없으면 아래 2줄 제거
				packet = new DatagramPacket(buf, buf.length, packet.getAddress(), packet.getPort());
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// socket.close();
	}

}
