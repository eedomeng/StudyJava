package com.mc.tour.service;

public class Tour {
	private Airline[] airlines;
	private Tourist tourist;
	
	public Tour(Airline[] airlines, Tourist tourist) {
		this.airlines = airlines;
		this.tourist = tourist;
	}

	public boolean isAble(int num) {
		// 보유 금액으로 티켓 구매 가능 여부 확인
		return tourist.getBalance() >= airlines[num].getAirfare();
	}

	public void buyTicket(int num) {
		// 티켓 구매로 인한 보유금액 차감 및 마일리지 적립 연산 수행
		tourist.deductBalance(airlines[num].getAirfare());
		tourist.addMileage(airlines[num].getMileage());
	}
	
}
