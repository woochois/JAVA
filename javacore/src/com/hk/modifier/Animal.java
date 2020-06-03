package com.hk.modifier;

public class Animal {
	
	// private 는 지금 이 공간에서만 사용 - 외부 접근 불가 (작성된 클래스 안에서만)
	// public 은 어딜 가든 다 사용 - 외부 접근 가능 (패키지, 클래스 어디든 상관없다.)
	// protected 는 상속 받은 클래스까지만 사용 - 상속된 클래스 접근 가능
	
	private int leg;
	private int wing;
	private String food;
	
	public Animal(){
		leg = 4;
		wing = 0;
	}
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getFood() { 
		return food;
	}

	private void setFood(String food) {
		this.food = food;
	}
	
	public void setMyFood(String food) {
		setFood(food);
	}
	
}
