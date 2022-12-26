package com.mc.h_abstract;

public class Rectangle extends Figure{
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 부모클래스로부터 상속받은 메서드를 재정의
	// @Override: Override annotation
	//			  annotation: 클래스가 컴파일 되기전에 수행되어야 하는 기능을 정의
	//			  @Override: 해당 메서드가 부모클래스로부터 상속받은 메서드를 알맞게 Override 했는지 검증
	@Override
	public double calArea() {
		return height * width;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	
}
