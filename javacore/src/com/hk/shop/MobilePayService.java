package com.hk.shop;

public class MobilePayService implements PayService{

	@Override
	public void payByCard() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("카카오뱅크 결제한다.");
	}

	@Override
	public void payByMileage() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("마일리지로 결제한다.");
	}

	@Override
	public void payByMoney() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("무통장입금한다.");
	}
	
	// 추가방법
	public void plus() {
		
	}
	
}
