package com.hk.abstrac;

// 추상클래스 - 클래스 내부에 추상메소드가 존재 : 무조건 상속수어
abstract public class Character {
	
	int x,y,z;
	
	// 추상메소드 - {} 대신에 abstract 를 붙인다.
	abstract void move(int x, int y, int z);
	
	// 파일종류 - docx, jpg, txt -> save();
	
}
