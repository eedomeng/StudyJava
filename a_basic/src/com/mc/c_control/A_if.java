package com.mc.c_control;

import java.util.Scanner;

public class A_if {

	public static void main(String[] args) {
		// 제어문: 코드의 흐름을 제어하는 문법
		// 조건문, 반복문
		// 단독 if문
		// [표현식]: if(조건식){실행코드}
		// 조건식이 참이면 실행코드 수행, 거짓이면 실행코드 무시

		testIf();
		
		int milkCnt = 1;
		boolean isExists = true;
		
		if(isExists) {
			milkCnt = 6;
		}
		System.out.println("우유" + milkCnt + "개 사옴");

	}

	private static void testIf() {
		// 사용자가 입력한 숫자가 1보다 크거나 같으면 "양수 입니다."를 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 하나 입력하세요: ");
		int input = sc.nextInt();

		if (input >= 1) {
			System.out.println("양수 입니다.");
		}
	}

}
