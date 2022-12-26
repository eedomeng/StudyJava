package com.mc.g_override_overloading.a_override;

public class Circle extends Figure{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 부모클래스로부터 상속받은 메서드를 재정의
	// @Override: Override annotation
	//			  annotation: 클래스가 컴파일 되기전에 수행되어야 하는 기능을 정의
	//			  @Override: 해당 메서드가 부모클래스로부터 상속받은 메서드를 알맞게 Override 했는지 검증	
	@Override
	public double calArea() {
		return Math.PI * radius * radius;
	}
	
	// 아래 코드는 Override가 아니라 Circle 클래스에 testExtends라는 메서드를 새롭게 정의한 것
	// @Override을 지정하면 에러가난다.
	// @Override
	private void testExtends() {
		System.out.println("private메서드는 상속이 안됩니다.");
	}
	
	// static 메서드도 상속이 안된다.
	// @Override
	public static void testStaticExtends() {
		System.out.println("static 메서드여서 상속 받지 못했습니다.");
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public String getName() {
		return "동그라미";
	}
	
	

}
