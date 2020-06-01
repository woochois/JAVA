package com.hk.constructor;

public class Product2 {
	static int count = 0; // 생선된 인스턴스의 수를 저장하기 위한 변수
	int serialNo; // 인스턴스 고유의 번호

	{ // 인스턴스 초기화 블럭 : 모든 생성자에서 공통적으로 수행될 코드
		++count;
		serialNo = count;
	}	
}
