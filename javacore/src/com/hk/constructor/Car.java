package com.hk.constructor;

public class Car {
	
	
	// 상태 - 인스턴스 변수
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	// 생성자 - 변수 초기화 함수
	Car(){
		// 기본 생성자
	}
/*	
	Car(){
		color = "white";
		gearType = "auto";
		door = 4;
	}
	Car(){
		Card("White", "auto", 4);
	}
	Car(){
		this("White", "auto", 4);
	}
	Car(){
		door = 5;
		this("White", "auto", 4);
	}
*/	
	Car(String c){
		  color = c;
	}
	Car(String c, String g){
		color = c;
		gearType = g;
	}
/*	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}*/
	Car(String c, String g, int d){
		this.color = c;
		this.gearType = g;
		this.door = d;
	}
	// 동작 - 인스턴스 함수 메소드

}
