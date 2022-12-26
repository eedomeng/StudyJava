package com.mc.c_control;

import java.util.Scanner;

public class C_ifelseif {
	public static void main(String[] args) {
		testIfElseIf();

		// 사용자로 부터 점수를 입력 받아 등급을 출력하세요
		// 90점 이상이면 A
		// 80점 이상 90점 미만이면 B
		// 70점 이상 80점 미만이면 C
		// 60점 이상 70점 미만이면 D
		// 60점 미만이면 F 로 등급입니다.
		// 이 때 F가 아닌 경우, 점수가 반올림 했을 때 올림처리 되는 경우에는 등급 뒤에 +를 붙여주세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();

		String grade = "";

		if (score < 60) {
			System.out.println("F");
			return; // 메서드 종료
		}

		if (score >= 60) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			}
			if (score % 10 >= 5) {
				grade += "+";
			}
		}
		System.out.println(grade);
	}

	private static void testIfElseIf() {
		// 다중조건문
		// [표현식]: if(A조건식){실행코드}
		// else if(B조건식){실행코드} => A조건식에 일치하지 않는 경우 중에서 B조건식이 참인 경우 실행코드를 수행
		// else{실행코드}
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		String comment = "";

		if (num > 0) {
			comment = "양수";
		} else if (num < 0) {
			comment = "음수";
		} else {
			comment = "0";
		}
		System.out.println(comment);
	}

}
