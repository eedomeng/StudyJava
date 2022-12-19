package com.mc.qrserver.presentation;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class QRController {
	private ServerSocket serverSocket;
	
	public QRController() {
		try {
			serverSocket = new ServerSocket(80);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void startServer() {
		System.out.println("QR서버 시작합니다...");
		
		// connectionless: Http 서버는 요청에 대한 응답이 끝나면 통신을 종료(socket을 닫는다) 해준다.
		// stateless: Http 서버는 사용자의 이전 상태를 기억하지 않는다.
		//			  클라이언트가 매 요청 자신을 인증할 수 있는 정보를 함께 보낸다.
		while (true) {
			// try-with-resource로 인해 매 요청 소켓을 닫아줌
			try {
				Socket socket = serverSocket.accept();
				BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				StringBuffer sb = new StringBuffer();
				String responseStartLine = "http/1.1 200 ok \n";
				String responseHeader = "Content-Type: text/html; Charset=utf-8 \n\n";
				String body = "안녕 브라우저";
				
				String httpMessage = responseStartLine + responseHeader + body;

//				testHttpMessage(br, sb);
				bos.write(httpMessage.getBytes());
				bos.flush();
				
				socket.close();

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				
			}
		}
	}

	private void testHttpMessage(BufferedReader br, StringBuffer sb) throws IOException {
		String httpMessage;
		// http message를 구경해보자
		while((httpMessage = br.readLine()) != null) {
			sb.append(httpMessage);
		}
		System.out.println(sb);
	}

}
