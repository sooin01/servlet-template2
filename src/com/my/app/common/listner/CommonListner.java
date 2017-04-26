package com.my.app.common.listner;

import java.net.SocketException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.my.app.common.server.EchoServer;

public class CommonListner implements ServletContextListener {

	private EchoServer echoServer;

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			echoServer = new EchoServer();
			echoServer.start();
			System.out.println("Echo server start.");
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		echoServer.interrupt();
	}

}
