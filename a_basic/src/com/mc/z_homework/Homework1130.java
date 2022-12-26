package com.mc.z_homework;

import java.util.Scanner;

public class Homework1130 {
	public static void main(String[] args) {
		// q1();
		// q2();
		// q3();
		// q4();
		// q5();
		// q6();
		// s1();
		// s2();
		s3();
	}

	private static void q1() {
		// 사용자로부터 줄 수와 칸수를 입력받아서
		// 사각형을 별로 그리는 이중반복문 작성하시오
		// 출력예시
		// 줄 수 : 3
		// 칸 수 : 4
		//	      ****
		//	      ****
		//	      ****
		Scanner sc = new Scanner(System.in);

		System.out.print("줄 수를 입력하세요: ");
		int row = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		int column = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void q2() {
		// 사용자로부터 정수를 하나 입력받아
		// 사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
		// 숫자는 1~사용자가 입력한 숫자까지.
		// 출력 예시
		// 숫자 : 4
		// 1***
		// *2**
		// **3*
		// ***4
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print(i);
				} else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private static void q3() {
		//	  사용자로부터 정수를 하나 입력받아
		//    정수만큼의 높이를 가지는 직각삼각형을  * 을 사용해 그리세요
		//    이 때 빗변은 해당 행의값을 출력합니다.
		//    출력예시 : 숫자 : 5      
		//      1
		//      *2
		//      **3
		//      ***4
		//      ****5
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					System.out.print(i);
				} else if (i > j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	private static void q4() {
		// 사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
		// 다운로드 진행창을 출력하시오
		// 사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
		// [출력양식]
		// n번째 프로그램 다운로드 받습니다.
		// 0% 진행중...
		// 20% 진행중...
		// 40% 진행중...
		// 60% 진행중...
		// 80% 진행중...
		// 100% 진행중...
		// n번째 프로그램 다운로드 완료되었습니다.
		// -------------------------------
		// 모든 프로그램 다운로드 완료
		Scanner sc = new Scanner(System.in);

		System.out.print("프로그램 개수: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d번째 프로그램 다운로드 받습니다.\n", i);
			for (int z = 0; z <6; z++) {
				System.out.println(z * 20 + "% 진행중...");
			}
			System.out.println(i + "번째 프로그램 다운로드 완료되었습니다.");
			System.out.println("-------------------------------");
		}
		System.out.println("모든 프로그램 다운로드 완료");
	}
	
	private static void q5() {
		//   사용자로부터 숫자와 방향(+,-) 를 입력받아
		//   사용자가 입력한 방향에 따라 삼각형 밑변의 위치를 다르게 출력하시오.
		//   
		//   출력예시
		//      숫자 : 4
		//      방향(+ 또는 -) : -
		//      ****
		//      ***
		//      **
		//      *
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int cnt = sc.nextInt();
		System.out.print("방향(+ 또는 -): ");
		String dir = sc.next();

		if (dir.equals("+")) {
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (dir.equals("-")) {
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < cnt - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else
			System.out.println("올바른 기호를 입력해주세요.");

	}
	
	private static void q6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		System.out.print("방향(+ 또는 -): ");
		String dir = sc.next();
		
		if(dir.equals("+")) {
			for (int i = 1; i <= num; i++) {
				for (int j = num; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
				for (int j = num; j > i; j--) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		} else if (dir.equals("-")) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}

				for (int j = i; j <= 2 * num - i; j++) {
					System.out.print("*");
				}
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println("");
			}
		} else
			System.out.println("제대로 입력하세요.");
	}
	
	private static void s1() {
		//  한 변을 구성하는 별의 개수가 사용자가 입력한 값이 되도록 하는 다이아몬드를 그리시오
		//   숫자 : 5
		//	   *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//	   *
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int num = sc.nextInt();	
		for(int i = 1; i <= num; i++) {
		    for(int j = num; j > i; j--) {
		        System.out.print(" ");
		    }
		    for(int k = 1; k <= 2*i-1 ; k++) {
		        System.out.print("*");
		    }
		    for(int l = num; l > i; l--) {
		        System.out.print(" ");
		    }
		    
		    System.out.println("");
		}

		for(int i = 1; i < num; i++) {
		    for(int j = 1; j <= i; j++) {
		        System.out.print(" ");
		    }
		    for(int k = i; k < 2*num - i-1; k++) {
		        System.out.print("*");
		    }
		    for(int j = 1; j <= i; j++) {
		        System.out.print(" ");
		    }		    
		    System.out.println("");
		}
	}
	
	private static void s2() {
		// 가위바위보 2선승제
		// n승 n무 n패
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 가위바위보 게임 ====");

		int w = 0, l = 0, d = 0;
		
		while(w != 2 && l != 2) {
			System.out.print("나: ");
			String p1 = sc.next();
			if (!p1.equals("가위") && !p1.equals("바위") && !p1.equals("보")) {
				System.out.println("제대로 입력바람");
				continue;
			}
			
			System.out.print("너: ");
			String p2 = sc.next();
			if (!p2.equals("가위") && !p2.equals("바위") && !p2.equals("보")) {
				System.out.println("제대로 입력바람");
				continue;
			}
						
			boolean win = p1.equals("가위") && p2.equals("보") || p1.equals("바위") && p2.equals("가위")
					|| p1.equals("보") && p2.equals("바위");
					
			if (win) {
				System.out.println("이겼습니다.");
				w++;		
			} else if (!win) {
				if (p1.equals(p2)) {
					System.out.println("비겼습니다.");
					d++;	
				} else {
					System.out.println("졌습니다.");
					l++;	
				} 		
			}	
		}		
		System.out.println(w + "승" + d + "무" + l + "패 하셨습니다.");
	}
	
	// s3() ~ calGameResult(): s2() 리팩토링	
	public static void s3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 가위바위보 게임 ====");

		int w = 0, l = 0, d = 0;

		while (w < 2 && l < 2) {
			System.out.print("나: ");
			String p1 = sc.next();
			if (!p1.equals("가위") && !p1.equals("바위") && !p1.equals("보")) {
				System.out.println("제대로 입력바람");
				continue;
			}

			System.out.print("너: ");
			String p2 = sc.next();
			if (!p2.equals("가위") && !p2.equals("바위") && !p2.equals("보")) {
				System.out.println("제대로 입력바람");
				continue;
			}
			
			// p1, p2: 전달인자, calGameResult에 사용자로 부터 입력받은 패를 전달
			String msg = calGameResult(p1, p2);	
			
			if(msg.equals("이겼습니다.")) w++;
			if(msg.equals("비겼습니다.")) d++;
			if(msg.equals("졌습니다.")) l++;
			System.out.println(msg);
		}
		System.out.println(w + "승" + d + "무" + l + "패 하셨습니다.");
	}
	
	// 매개변수: 호출부에서 전달하는 값인 전달인자를 저장하기 위한 변수
	// 반환형(return type): 메서드의 실행이 끝났을 때 호출부로 반환할 값의 타입
	 public static String calGameResult(String p1, String p2) {
		String msg = "";
		int w = 0, d = 0, l = 0;
		
		boolean win = p1.equals("가위") && p2.equals("보") || p1.equals("바위") && p2.equals("가위")
				|| p1.equals("보") && p2.equals("바위");

		if (win) {
			msg = "이겼습니다.";
		} else if (!win) {
			if (p1.equals(p2)) {
				msg = "비겼습니다.";
			} else {
				msg = "졌습니다.";
			}
		}
		
		return msg;
	}
}
