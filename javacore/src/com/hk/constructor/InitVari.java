package com.hk.constructor;

// 변수의 초기화 방법
public class InitVari {
	// 인스턴스 변수
	int x;
	int door = 4; // 기본적으로 문은 4개 (명시적 초기화) : 공통값
	int[] map = new int[10];
	{  // 초기화 블럭 (명시적 초기화 다음에)
		for(int i = 0; i < 10; i++) {
			map[i] = i;
		}
		door = 3; // 초기화 블럭 (명시적 초기화 다음에)
	}
	
	// InitVari() {} -- 기본 생성자 --> 생성자를 알아야하는 이유
	
	// 인스턴스 메소드
	public void print(int a) {
		int lv = a; // 지역변수는 무조건 초기화 (필수)
		System.out.println("입력 값을 출력하시오 . " + (lv + a));
	}
}
