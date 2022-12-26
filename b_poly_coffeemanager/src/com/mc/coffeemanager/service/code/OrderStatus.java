package com.mc.coffeemanager.service.code;

// enum(enumerated type): 열거형
// 서로 연관된 상수들의 집합
// 서로연관된 상수들을 편하게 다루기 위한 enum만의 문법과 메서드가 제공된다.

/**
 * 주문 상태 코드
 * @author 이도명
 *
 */
public enum OrderStatus {
	/** 주문 생성 성공 */
	OK(0, "주문 생성 성공"),
	
	/** 품절로 인한 주문 실패 */
	FAIL_CAUSE_SOLDOUT(1, "품절로 인한 주문 실패"),
	
	/** 재고 부족으로 인한 주문 실패 */
	FAIL_CAUSE_STOCK(2, "재고 부족으로 인한 주문 실패"),
	
	/** 시즌기간이 아닐 때 주문해 실패 */
	FAIL_CAUSE_SEASON(3, "시즌 기간이 아닙니다."),	
	
	/** 주문 완료 */
	COMPLITE(4, "주문 완료");
	
	/** 주문 상태 코드 */
	private int code;
	
	/** 주문 상태 상세 */
	private String desc;
	
	private OrderStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	/** 주문 상태가 OK */
	public boolean isOk() {
		return code == OK.code;
	}
	
	/** 주문 상태가 COMPLITE */
	public boolean isComplete() {
		return code == COMPLITE.code;
	}
	
	/** 주문 상태가 FAIL, SOLD_OUT, notSEASON */
	public boolean isFail() {
		if(code == FAIL_CAUSE_SOLDOUT.code || code == FAIL_CAUSE_STOCK.code || code == FAIL_CAUSE_SEASON.code) {
			return true;
		}
		
		return false;
	}
	
	public String desc() {
		return desc;
	}


}
