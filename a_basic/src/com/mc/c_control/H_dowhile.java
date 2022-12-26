package com.mc.c_control;

public class H_dowhile {

	public static void main(String[] args) {
		int i = 1;

		while (i > 1) {
			System.out.println("while문 입니다.");
		}

		do {
			System.out.println("dowhile문 입니다.");
		} while (i > 1); // 조건식이 거짓이더라도 최초 1번은 실행된다.

	}

}
