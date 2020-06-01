package com.hk.constructor;

public class Trump {
	
	// 상태
	int num; 
	String kind; 
	
	void Trump() { // 기본 생성자 : 없으면 자동 생성 (눈에 보이지 않아도 생성되어있다.)
		
	}
	void Trump(int x) { // 오버로딩 개념 포함
		num = x;
	}
			
	// test main
	public static void main(String[] args) {
		// 트럼프 클래스(설계)로 인스턴스변수(객체-메모리값)
		Trump dia9 = new Trump();
		// 클래스명 객체명 = new 생성자();		
	}
}
