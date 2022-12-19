package com.mc.qrserver;

import com.mc.qrserver.http.TCPServer;
import com.mc.qrserver.presentation.QRController;

public class Run {

	public static void main(String[] args) {
		new TCPServer().startServer();
	}

}
