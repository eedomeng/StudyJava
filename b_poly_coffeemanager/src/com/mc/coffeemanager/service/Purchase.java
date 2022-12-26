package com.mc.coffeemanager.service;

public class Purchase {
	private Coffee coffee;
	private int purchaseCnt; // 매입개수
	private int budget;// 매입금액
	
	public Purchase(Coffee coffee, int purchaseCnt) {
		super();
		this.coffee = coffee;
		this.purchaseCnt = purchaseCnt;
		this.budget = coffee.getCost()*purchaseCnt;
	}
	
	public Coffee getCoffee() {
		return coffee;
	}
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	
	public int getPurchaseCnt() {
		return purchaseCnt;
	}
	
	public void setPurchaseCnt(int purchaseCnt) {
		this.purchaseCnt = purchaseCnt;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	} 	
	
	public boolean execute() {
		if(Account.getInstance().registerExpences(budget)) {
			coffee.addStock(purchaseCnt);
			return true;
		}
		
		return false;
	}

}
