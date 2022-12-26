package com.mc.h_abstract;

// 추상 클래스
// 추상 메서드가 0개 이상 존재하는 클래스
// 추상 메서드가 존재한다면 반드시 추상 클래스로 만들어야 한다.

// 추상 클래스는 미완성의 클래스이기 때문에 인스턴스화가 불가능하다.
// 추상 클래스를 상속받은 자식 클래스는 추상 메서드를 Override 함으로써 추상 클래스를 완성시킨다.
public abstract class Figure {
	// 추상 메서드
	// abstract: 미완의, 추상의
	// Figure 클래스를 상속받는 클래스에서는 반드시 calArea 메서드를 Override 해야만 한다.
	// 도형마다 넓이를 구하는 공식이 있지만 그 공식의 내용은 모두 다르기 때문에
	// Figure 클래스를 상속받는 모든 자식클래스에서 규칙을 제정의하도록 강제
	public abstract double calArea();
	
	public void testBody() {
		System.out.println("추상 클래스에도 구현부가 있는 메서드를 만들 수 있다.");
	}
	

}
