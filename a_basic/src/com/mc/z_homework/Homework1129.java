package com.mc.z_homework;

import java.util.Scanner;

public class Homework1129 {

	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		 //q4();
		 q5();
	}

	private static void q5() {
		// q5.
		// 사용자로부터 정수 하나를 입력받아
		// 정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오
		// 1~9사이의 숫자가 아니라면 "1~9 사이의 숫자를 입력하세요."를 출력
		// ex)
		// 정수 : 5
		// 5*1=5
		// 5*2=10
		// 5*3=15
		// 5*4=20
		// 5*5=25
		// 5*6=30
		// 5*7=35
		// 5*8=40
		// 5*9=45
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");
		int dan = sc.nextInt();

		int su = 1;

		if (dan < 1 || dan > 9) {
			System.out.println("1~9사이의 숫자를 입력하세요.");
			return;
		}

		while (su < 10) {
			System.out.println(dan + "*" + su + "=" + (dan * su));
			su++;
		}
	}

	private static void q4() {
		// q4.
		// 1P 유저로부터 가위바위보 중 하나를 입력받으세요.
		// 2P 유저로부터 가위바위보 중 하나를 입력받으세요.
		// 1P 유저 기준에서 승/패/비김 여부를 출력해주세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 가위바위보 게임 ====");

		System.out.print("1P: ");
		String p1 = sc.next();
		System.out.print("2P: ");
		String p2 = sc.next();

		boolean win = p1.equals("가위") && p2.equals("보") || p1.equals("바위") && p2.equals("가위")
				|| p1.equals("보") && p2.equals("바위");

		if (win) {
			System.out.println("승");
		} else if (!win) {
			if (p1.equals(p2)) {
				System.out.println("비김");
			} else
				System.out.println("패");
		}
	}

	private static void q3() {
		// q3. 사용자가 입력한 정수가 짝수 인지 판단하고
		// 짝수라면 '짝수 입니다.'
		// 홀수라면 '홀수 입니다.' 를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else
			System.out.println("홀수 입니다.");
	}

	private static void q2() {
		// q2. 사용자로 부터 아이디와 비밀번호를 입력받아
		// 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
		// 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
		// 아이디 : test / 비밀번호 : java
		// 사용자로부터 아이디와 비밀번호를 입력받는다.
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력해주세요: ");
		String inputId = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요: ");
		String inputPw = sc.nextLine();

		String id = "test";
		String pw = "java";

		if (inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("로그인 되었습니다.");
		} else
			System.out.println("누구야 당신?");
	}

	private static void q1() {
		// q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오
		// 사용자로 부터 정수를 하나 입력 받으세요
		Scanner sc = new Scanner(System.in);

		System.out.print("윗변: ");
		int upper = sc.nextInt();
		System.out.print("아랫변: ");
		int lower = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();

		int area = (upper + lower) * height / 2;
		System.out.println(area);

	}
}
