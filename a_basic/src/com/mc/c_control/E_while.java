package com.mc.c_control;

import java.util.Scanner;

public class E_while {

	public static void main(String[] args) {
		// [표현식]: while(조건식){실행코드}
		// 조건식이 참이면 실행코드 반복, 거짓이면 반복 종료

		// 무한반복문
//		while(true) {
//			System.out.println("멈추지 않아! 중요한건 꺾이지 않는 마음");
//		}

		studyWhile();

		// 사용자로부터 비밀번호를 입력받아서
		// 비밀번호가 일치하면 "로그인 되었습니다."를 출력하고 반복문을 종료
		// 비밀번호가 일치하지 않으면 "비밀번호가 틀렸습니다"를 출력하고 다시 비밀번호를
		// 입력받을 수 있도록 한다.
		// * 비밀번호 : 123abc
		Scanner sc = new Scanner(System.in);

		String password = "123abc";
		boolean run = true;

		while (run) {
			System.out.print("비밀번호를 입력하세요: ");
			String pw = sc.nextLine();
			
			if (pw.equals(password)) {
				System.out.println("로그인 되었습니다.");
				run = false;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}

	private static void studyWhile() {
		// 다섯번 반복하는 while문
		int a = 0;
		while (a < 5) {
			System.out.println("멈추지 않아! 중요한건 꺾이지 않는 마음");
			a++;
		}
	}

}
