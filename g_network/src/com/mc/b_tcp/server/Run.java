package com.mc.b_tcp.server;

import com.mc.b_tcp.client.TCPClient;

public class Run {

	public static void main(String[] args) {
		new TCPServer().serverStart();
	}

}
