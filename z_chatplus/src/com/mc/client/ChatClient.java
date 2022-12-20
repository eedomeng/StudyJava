package com.mc.client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ChatClient {
	private Socket socket;
	private Map<String, Socket> clients;
	

	public ChatClient() {
		clients = Collections.synchronizedMap(new HashMap<>());
	}

	public void startChat() {
		connect();
		read();
		write();
	}
	
	private void Dm(String message) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			
			int begin = message.indexOf("") + 1;
			int end = message.indexOf("", begin);
			
			if(end != -1) {
				String id = message.substring(begin, end);
				String msg = message.substring(end + 1);
				//oos = clients.get(Id);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void read() {
		
		new Thread(() -> {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
				
				while (true) {
					String message = br.readLine();
					System.out.println(message);
				
				}

			} catch (IOException e) {
				System.out.println("연결이 종료되었습니다.");
				closeSocket();
			}
		}).start();
	}

	private void closeSocket() {
		try {
			socket.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void write() {
		new Thread(() -> {
			Scanner sc = new Scanner(System.in);

			System.out.print("닉네임 : ");
			String userId = sc.nextLine();
			
			clients.put(userId, socket);

			try (PrintWriter writer = new PrintWriter(socket.getOutputStream())) {
				while (true) {
					String message = sc.nextLine();
					System.out.println();
					writer.println(userId + " : " + message);
					writer.flush();
				}

			} catch (IOException e1) {
				e1.printStackTrace();
				closeSocket();
			}
		}).start();
	}

	private void connect() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연결할 서버의 IP: ");
		String host = sc.nextLine();

		System.out.print("연결할 서버의 port: ");
		int port = sc.nextInt();

		try {
			this.socket = new Socket(host, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
