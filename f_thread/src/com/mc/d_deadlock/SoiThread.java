package com.mc.d_deadlock;

public class SoiThread implements Runnable{
	private Bottle bottle;
	private Home home;
		
	public SoiThread(Bottle bottle, Home home) {
		super();
		this.bottle = bottle;
		this.home = home;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + ": 간장 발견!");
			System.out.println(Thread.currentThread().getName() + ":" + bottle.input("간장") + " 냉장고에 넣는다.");
			home.leaveHome("간장소녀");
		}
	}
	
}
