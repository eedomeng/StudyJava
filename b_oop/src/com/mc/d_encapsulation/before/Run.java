package com.mc.d_encapsulation.before;

public class Run {

	public static void main(String[] args) {
		// 상속: 부모클래스가 가진 속성, 메서드, 타입을 자식클래스에게 물려주는 것
		
		// 제조사, 상품명, 가격, CPU, RAM, 일체여부
		Desktop desktop = new Desktop("삼성", "울트라", 2000000, "intel", 16, true);
		
		// 제조사, 상품명, 가격, CPU, RAM, 통신사
		SmartPhone smartPhone = new SmartPhone("사과", "아이폰", 1300000, "긱벤치", 8, "SKT");
		
		// 제조사, 상품명, 가격, 인치(크기)
		TV tv = new TV("LG", "LG티비", 3000000, 52);
		
		System.out.println(desktop.toString());
		System.out.println(smartPhone); // 레퍼런스를 println에 넣으면 자동으로 toString을 호출
		System.out.println(tv);
		
		// 세 클래스가 모두 가지고 있는 속성: 제조사, 상품명, 가격     => product
		// Desktop, SmartPhone이 공통으로 가지고 있는 속성: CPU, RAM   => Computer
	}

}
