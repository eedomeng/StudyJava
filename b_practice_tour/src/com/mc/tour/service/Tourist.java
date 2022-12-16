package com.mc.tour.service;

public class Tourist {
	private int balance; // 보유 금액
	private int Mileage; // 마일리지
	
	public Tourist() {
		// TODO Auto-generated constructor stub
	}

	public Tourist(int balance, int mileage) {
		super();
		this.balance = balance;
		Mileage = mileage;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMileage() {
		return Mileage;
	}

	public void setMileage(int mileage) {
		Mileage = mileage;
	}

	public void deductBalance(int price) {
		this.balance -= price;
		
	}

	public void addMileage(int mileage) {
		this.Mileage += mileage;
		
	}

}
