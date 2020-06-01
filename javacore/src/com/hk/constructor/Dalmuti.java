package com.hk.constructor;

public class Dalmuti {
	
	int kind, count;
	
	// 역할 - 클래스의 인스턴스 변수 초기화
	// void 사용하지 않음
	Dalmuti() { 
		// 기본 생성자 - 자동으로 생성되기 때문에 안 만들어도 된다.
	}
	Dalmuti(int k) { 
		// 일반 생성자 - 매개변수를 쓰려면 직접 만들어야한다.
		kind = k;
	}
}
