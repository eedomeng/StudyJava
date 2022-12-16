package com.mc.d_deadlock;

public class CoffeeThread implements Runnable{
	private Bottle bottle;
	private School school;
	
	public CoffeeThread(Bottle bottle, School school) {
		super();
		this.bottle = bottle;
		this.school = school;
	}

	@Override
	public void run() {
		while(true) {
			school.leaveSchool("커피소년");
			System.out.println(Thread.currentThread().getName() + ": 커피 발견!");
			System.out.println(Thread.currentThread().getName() + ":" + bottle.input("커피") + "마신다.");	
		}		
	}

}
