package com.hk.classs;

public class Product {
	// 자판기 제품 가격
	final int RED = 3000;
	final int YELLOW = 3500;
	final int BROWN = 4000;
	final int VIOLET = 5000;
	
	// 투입된 금액
	int inMoney;
	
	public void enterMoney(int money) {
		inMoney = money;
	}
	
	public void buy(int kind) {
		switch(kind) {
		case 1:
			if(compute(RED)==true) System.out.println("1번 새콤달콤 딸기맛 아이스크림~");
			break;
		case 2:
			if(compute(YELLOW)==true) System.out.println("2번 바닐라맛 아이스크림입니다~");
			break;
		case 3:
			if(compute(BROWN)==true) System.out.println("3번 초코쿠키가 듬뿍 들어간 초코맛 아이스크림 야미~");
			break;
		case 4:
			if(compute(VIOLET)==true) System.out.println("4번 몸에 좋은 블루베리 있는 아이스크림이 쏙~");
			break;
		default: System.out.println("잘못 선택하셨습니다.");
		}
	}
	
	// 자판기 금액에서 차감 메서드
	public boolean compute(int money) {
		if(inMoney > money) {
			System.out.println("금액이 부족합니다. 돈을 더 넣어주세요.");
			return false;
		}else {
			inMoney -= money;
			return true;
		}
	}
	
	public void printMoney() {
		int temp = inMoney;
		int m1000 = 0;
		int m500 = 0;
		int m100 = 0;
		int m50 = 0;
		int m10 = 0;
		m1000 = temp / 1000;
		temp %= 1000;
		m500 = temp / 500;
		temp %= 500;
		m100 = temp / 100;
		temp %= 100;
		m50 = temp / 50;
		temp %= 50;
		m10 = temp / 10;
		temp %= 10;
		System.out.println("거스름돈 총:" + inMoney + "원");
		System.out.println("1000원: " + m1000);
		System.out.println("500원: " + m500);
		System.out.println("100원:" + m100);
		System.out.println("50원: " + m50);
		System.out.println("10원: " + m10);
		System.out.println("입니다.");
		
	}
}
