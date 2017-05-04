package com.my.app.common.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EchoServer extends Thread {

	private DatagramSocket socket;

	public EchoServer() throws SocketException {
		socket = new DatagramSocket(4445);
	}

	@Override
	public void run() {

		while (true) {
			try {
				byte[] buf = new byte[64000]; // 64000 바이트 (64kb)
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);

				// 클라이언트 기다림
				socket.receive(packet);

				// 멀티스레드 비즈니스 처리
				// new EchoProcess(socket, packet, buf).start();

				// 단일스레드 비즈니스 처리
				// new EchoProcess(socket, packet, buf).run();

				// 내부 비즈니스 처리
				process(buf, packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 서버에선 socket close 하지 않음
		// socket.close();
	}

	private void process(byte[] buf, DatagramPacket packet) throws IOException {
		List<byte[]> dataList = new ArrayList<byte[]>();
		byte[] src = packet.getData();
		int index = 0;

		while (index < packet.getLength()) {
			byte[] dest = new byte[111];
			System.arraycopy(src, index, dest, 0, dest.length);
			dataList.add(dest);
			index += dest.length;
		}

		for (byte[] bs : dataList) {
			print(bs);
		}

		// 클라이언트에 응답 필요없으면 아래 2줄 제거
		packet = new DatagramPacket(buf, buf.length, packet.getAddress(), packet.getPort());
		socket.send(packet);
	}

	private static void print(byte[] row) throws UnsupportedEncodingException {
		String received = new String(row, "MS949");
		System.out.println("Receive message: [" + received.trim() + "]");

		// 1, 18, 6, 4, 40, 1, 40, 1
		slice(row, 0, 1); // 1
		slice(row, 1, 19); // 18
		slice(row, 19, 25); // 6
		slice(row, 25, 29); // 4
		slice(row, 29, 69); // 40
		slice(row, 69, 70); // 1
		slice(row, 70, 110); // 40
		slice(row, 110, 111); // 1
	}

	private static void slice(byte[] row, int from, int to) throws UnsupportedEncodingException {
		byte[] col1 = Arrays.copyOfRange(row, from, to);
		System.out.println("Receive message: [" + new String(col1, "MS949") + "] (" + col1.length + ")");
	}

}
