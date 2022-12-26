package com.mc.b_operator;

public class E_논리연산자 {

	public static void main(String[] args) {
		// 논리연산자: &&, ||
		// ||: 두 항이 모두 false일 때 false, ~또는, ~거나, or
		
		System.out.println(2 >= 2 || 2 > 3); // true || false == true
		System.out.println(2 > 1  || 3 > 2); // true || true == true
		System.out.println(3 < 2 || 2 > 3); // false || false == false
		System.out.println(2 < 2 || 2 < 3); // false || true == true
		
		// &&: 두 항이 모두 true일 때 true, ~면서, ~그리고, and
		System.out.println(2 >= 2 && 2 > 3); // true || false == false
		System.out.println(2 > 1  && 3 > 2); // true || true == true
		System.out.println(3 < 2 && 2 > 3); // false || false == false
		System.out.println(2 < 2 && 2 < 3); // false || true == false
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		
		// 아래 논리연산의 출력값을 예상해보세요.
		// &&의 연산 우선순위가 높다.
		System.out.println(a || b && c || d); // true
		
		// ()를 사용해 연산 우선순위를 바꿀 수 있다.
		System.out.println((a || b) && c || d); // false
	}

}
