package com.hk.elect;

public class CAR {
	// 1. 상태
	// 차량색깔
	String color;
	// 기어 1 2 3 4
	int gear;
	// 현재 속도 0.0 100.5
	float velocity;
	// 연식 2012 2020
	String year;
	
	// 2. 행동, 동작
	// 가속, 감속
	void GasPedal(int a) {velocity += (float)a * 10.0f;}
	// 기어 변경
	void gearCHANGE(int g) {gear = g;}
	// 브레이크 (속도 0)
	void breakSTOP() {
		while(true) {
			velocity -= 30.0f;
			if(velocity >= 0) {
				velocity = 0.0f;
				break;
			}
		}
		
	}
}
