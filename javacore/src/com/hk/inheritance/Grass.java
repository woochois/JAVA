package com.hk.inheritance;

// 잔디 클래스 정의
public class Grass extends Character{
	Grass(){ // 좌표 없음 - 움직이지 않으니까
		move = false;
		life = 1;
	}
}
