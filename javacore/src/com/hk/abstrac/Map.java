package com.hk.abstrac;

public class Map {
	public static void main(String[] args) {
		System.out.println("맵화면입니다.");
		// House father = new House(); 
		Character[] ch = new Character[10];
		ch[0] = new House();
		ch[1] = new House(); // 친구집
		for(int i = 0; i < ch.length; i++) {
			ch[i].x = i;
		}
		// House h = new Character(); -- 불가능
		// House h = (House)(new Character()); // 강제형변환 가능 - 데이터 손실
		/*
		 * int a = 0;
		 * double b = 0;
		 * a = (int)b;
		 */
		
	}
}
