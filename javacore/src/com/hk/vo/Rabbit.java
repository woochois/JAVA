package com.hk.vo;

public class Rabbit {
	
	// DTO = 구조체 = VO : 셋 다 같은 말
	// 다른 곳에서 값 변경 불가 (호출한 클래스에선 값 변경 불가)
	// 현재 클래스 내부에서만 값 변경 가능
	private int x, y;
	private String col;
	private boolean character; // 화날 때 1, 얌전할 때 0
	
	
	// 자동 생성
	// 이클립스 좌측 상단 source -> Generate Getters and Setters..
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public boolean isCharacter() {
		return character;
	}
	public void setCharacter(boolean character) {
		this.character = character;
	}
	
	// 수동으로 생성
	// 상태값 변경, 볼려면 
	// getter & setter - 값을 가져오고 값을 변경하고
	// 예제
/*
	public void setCol(String c){ // public을 씀으로 다른 클래스에서 이 함수 사용 가능
		col = c;
	}
	
	public String getCol(){
		return col;
	}
*/
	
	
	
}
