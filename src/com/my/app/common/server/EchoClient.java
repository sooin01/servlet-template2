package com.my.app.common.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.my.app.common.util.ByteUtil;

public class EchoClient extends Thread {
    private DatagramSocket socket;
    private InetAddress address;

    public EchoClient() throws SocketException, UnknownHostException {
        socket = new DatagramSocket();
        address = InetAddress.getByName("192.168.0.11");
    }

    public String sendEcho(String msg) throws IOException {
    	byte[] buf = msg.getBytes("MS949");
    	return sendEcho(buf);
    }

    public String sendEcho(byte[] buf) throws IOException {
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        socket.send(packet);
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        return new String(packet.getData(), 0, packet.getLength());
    }

    public void close() {
        socket.close();
    }

    @Override
    public void run() {
    	try {
    		sendEcho(ByteUtil.getDataList());
		} catch (Exception e) {
			e.printStackTrace();
		}

    	close();
    }

    public static void main(String[] args) throws Exception {
    	for (int i = 0; i < 1; i++) {
    		EchoClient echoClient = new EchoClient();
    		echoClient.start();
    	}
	}

}
