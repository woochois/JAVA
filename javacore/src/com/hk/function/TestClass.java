package com.hk.function;

public class TestClass {
	
	
	
	// 인스턴스 변수 -- 상태 변수 -- 클래스로 인스턴스 생성
	String kind;
	int number;
	
	// 클래스 변수
	static int width; // 독립적인 변수 (공통으로  쓸 수 있다.)
	
	// 메소드 -- 동작 함수 -- 변수
	// 객체의 값을 가져오는 함수
	// 인스턴스 함수
	public String getKind() {
		return kind;
	}
	
	// 클래스 함수 (메소드) -- 인스턴스 변수나 메소드를 사용할 수 없다.
	public static int getWidth() {
		return width;
	}
	
	
	// 여기부터 프로그램 시작 (가정을 하자면)
	public static void main(String[] args) {
		TestClass heart = new TestClass();
		TestClass diamond = new TestClass();
		heart.kind = "하트";
		heart.number = 7;
		diamond.kind = "다이아몬드";
		diamond.number = 10;
		TestClass.width = 10;
		
		System.out.println("인스턴스 함수 : " + heart.getKind());
		System.out.println("인스턴스 함수 " + diamond.getKind());
		
		System.out.println("클래스 변수 : " + getWidth());
		
	}
	
	
}
