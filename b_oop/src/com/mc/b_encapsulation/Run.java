package com.mc.b_encapsulation;

public class Run {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.setName("아메리카노");
		System.out.println(americano.getName());
		
		americano.setPrice(-100);
	}
}
