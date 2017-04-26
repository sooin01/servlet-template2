package com.my.app.common.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class EchoServer extends Thread {

	private DatagramSocket socket;
	private boolean running;

	public EchoServer() throws SocketException {
		socket = new DatagramSocket(4445);
	}

	@Override
	public void run() {
		running = true;

		while (running) {
			try {
				byte[] buf = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);

				System.out.println("Echo server waiting.");
				socket.receive(packet);

				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buf, buf.length, address, port);
				String received = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
				System.out.println(address + " Receive message: " + received.trim());

				if (received.equals("end")) {
					running = false;
					continue;
				}

				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		socket.close();
	}

}
