package com.my.app.common.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class EchoServer extends Thread {

	private DatagramSocket socket;

	public EchoServer() throws SocketException {
		socket = new DatagramSocket(4445);
	}

	@Override
	public void run() {

		while (true) {
			try {
				byte[] buf = new byte[1024]; // 64000 바이트 (64kb)
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);

//				System.out.println("Echo server waiting.");
				socket.receive(packet);

				// 멀티스레드 비즈니스 처리
//				new EchoProcess(socket, packet, buf).start();

				// 단일스레드 비즈니스 처리
				new EchoProcess(socket, packet, buf).run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 서버에선 socket close 하지 않음
		// socket.close();
	}

}
