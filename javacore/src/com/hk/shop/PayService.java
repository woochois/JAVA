package com.hk.shop;

public interface PayService {
	public void payByCard(); // 추상메소드 정의
	public void payByMileage();
	public void payByMoney(); // 무통장입금
}
