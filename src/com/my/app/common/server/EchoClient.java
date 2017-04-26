package com.my.app.common.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class EchoClient {
    private DatagramSocket socket;
    private InetAddress address;

    public EchoClient() throws SocketException, UnknownHostException {
        socket = new DatagramSocket();
        address = InetAddress.getByName("192.168.0.11");
    }

    public String sendEcho(String msg) throws IOException {
        byte[] buf = msg.getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        socket.send(packet);
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        return received;
    }

    public void close() {
        socket.close();
    }

    public static void main(String[] args) throws Exception {
    	EchoClient echoClient = new EchoClient();
    	System.out.println(echoClient.sendEcho("hello world"));
    	System.out.println(echoClient.sendEcho("end"));
    	echoClient.close();
	}

}
