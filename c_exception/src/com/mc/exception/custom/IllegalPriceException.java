package com.mc.exception.custom;

// UnCheckedException
// RuntimeException을 상속 받아 구현
public class IllegalPriceException extends RuntimeException{
	private static final long serialVersionUID = 4482879933875221553L;
	
	public IllegalPriceException() {
		super("가격은 0보다 작을 수 없습니다");
	}

	public IllegalPriceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}
