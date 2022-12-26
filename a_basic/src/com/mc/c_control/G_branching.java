package com.mc.c_control;

import java.util.Scanner;

public class G_branching {

	public static void main(String[] args) {
		studyWhileBreak();	
		studyWhileContinue();
		
		// 1에서 10까지 정수들의 합계를 반복을 사용해서 구하시오.
		// 단 4의 배수는 제외하고 합산하시오.
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i % 4 != 0) { // continue 사용 => if ( i % 4 == 0) continue;
				sum += i;
			}
		}
		System.out.println(sum);

	}

	private static void studyWhileContinue() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("메시지를 입력하세요: ");
			String message = sc.nextLine();
			
			if(!message.equals("end")) {
				System.out.println(message);
				continue; // 실행코드 안에서 continue를 만날 경우 즉시 반복문의 조건식으로 이동
			}
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}

	private static void studyWhileBreak() {
		// 사용자로부터 문자열을 입력받아 출력하는 반복문을 작성하라
		// 사용자로부터 end라는 문자열을 입력받을 경우 반복문은 멈춘다.
		Scanner sc = new Scanner(System.in);
		boolean flg = true;

		while (flg) {
			System.out.print("메시지를 입력하세요: ");
			String message = sc.nextLine();

			if (message.equals("end")) {
				System.out.println("프로그램을 종료합니다.");
				flg = false;
				// return; // 반복문 뿐만 아니라, 반복문이 사용된 메서드를 멈추고 호출부로 돌아간다.
				break; // 즉시 반복문을 탈출
			}
			System.out.println(message);
		}
		System.out.println("반복문 수행 이후 메인 메서드 종료");
	}

}
