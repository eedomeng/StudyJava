package com.mc.qrgenerator;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QR코드로 만들 문자열을 입력하세요: ");
		String contents = sc.nextLine();	
		System.out.print("QR코드 파일명: ");
		String fileName = sc.nextLine();
		System.out.print("QR코드 ARGB 색상코드: ");
		String color = sc.nextLine();
		
		String path = "C:\\Program files\\Code\\QR\\";
		new File(path).mkdirs();
		
		QRCodeWriter qr = new QRCodeWriter();
		try (FileOutputStream fos = new FileOutputStream(path + fileName)){
			BitMatrix matrix = qr.encode(contents, BarcodeFormat.QR_CODE, 1000, 1000);
			
			int argb = (int)Long.parseLong(color, 16);
//			int argb2 = Integer.parseUnsignedInt(color, 16); // 위에꺼랑 같은방식
			System.out.println(argb);
//			System.out.println(argb2);
			
			MatrixToImageConfig config = new MatrixToImageConfig(argb, MatrixToImageConfig.WHITE);
				
			MatrixToImageWriter.writeToStream(matrix, "jpg", fos, config);
			
		} catch (IOException | WriterException e) {
			e.printStackTrace();
		}		
	}

}
