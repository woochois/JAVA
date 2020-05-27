package com.hk.elect;

public class TestELECT {

	public static void main(String[] args) {
		
		// TV 클래스 선언해서 미니티비 생성
		// 비교 1. 기본 타입 변수 선언
		// ex) int age;
		// 비교 2. 배열 변수 선언
		// ex) int[] scores = new int[10];
		TV mTV = new TV();
		// 10번 채널로 변경
		mTV.channelCHANGE(10);
		System.out.println("현재 채널은 : " + mTV.channel);
		// 5번 채널로 변경
		mTV.channelCHANGE(5);
		System.out.println("현재 채널은 : " + mTV.channel);
		
		//---------------------------------------------
		
		// CAR 클래스 선언해서 미니카 생성
		CAR mCAR = new CAR();
		// 색 변경
		mCAR.color = "블루";
		System.out.println("차의 색깔 : " + mCAR.color);
		// 연식 입력
		mCAR.year = "2012년형";
		System.out.println("연식 : " + mCAR.year);
		// 현재 속도
		System.out.println("현재 속도 : " + mCAR.velocity);
		// 기어 1단으로 변경
		mCAR.gearCHANGE(1);
		System.out.println("현재 기어는 : " + mCAR.gear);
		// 기어 3단으로 변경
		mCAR.gearCHANGE(3);
		System.out.println("현재 기어는 : " + mCAR.gear);
		// 가속 100km
		mCAR.GasPedal(10);
		System.out.println("가속된 현재 속도 : " + mCAR.velocity);
		// 브레이크
		mCAR.breakSTOP();
		System.out.println("브레이크 밟은 현재 속도 : " + mCAR.velocity);
		
		//---------------------------------------------
		
		// CAR 클래스 선언해서 TRUCK 생성
		CAR mTRUCK = new CAR();
		
		mTRUCK.color = "회색";
		System.out.println(mTRUCK.color);
		mTRUCK.year = "2020년형";
		System.out.println(mTRUCK.year);
		System.out.println("트럭의 속도 : " + mTRUCK.velocity);
		
		
		
		
	}
}
