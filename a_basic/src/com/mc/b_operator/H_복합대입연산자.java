package com.mc.b_operator;

public class H_복합대입연산자 {

	public static void main(String[] args) {
		// 대입연산자와 다른 연산자를 함께 사용하면 복합대입연산자
		int num = 12;
		num = num + 12;
		System.out.println(num);

		num += 12;
		System.out.println(num);

		num -= 12;
		System.out.println(num);

		num *= 12;
		System.out.println(num);

		num /= 12;
		System.out.println(num);

		num %= 12;
		System.out.println(num);

		// 대입연산자만을 활용해 a와 b의 값을 바꿔주세요.
		// a = "2번"; ==> 리터럴 직접 대입은 안됩니다.
		String a = "1번";
		String b = "2번";
		String c;
		
		c = a;
		a = b;
		b = c;
		System.out.printf("a: %s, b: %s", a, b);

	}

}
