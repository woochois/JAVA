package com.hk.vo;

public class TestUnit {
	public static void main(String[] args) {
		Rabbit whiteR = new Rabbit();
		whiteR.setCol("white");
		
		Rabbit pinkR = new Rabbit();
		pinkR.setCol("pink");
		
		// babyR[5] 
		// ex) int[] score = new int[5];  -- 배열 기본 구조랑 똑같다.
		Rabbit[] babyR = new Rabbit[5];
		for(int i = 1; i < babyR.length; i++) { // 반복문으로 5마리 토끼 생성
			babyR[i] = new Rabbit(); // 토끼 생성
			babyR[i].setCol("brown"); // 모두 갈색
		}
		
		System.out.println(pinkR.getCol());
		System.out.println(whiteR.getCol());
		System.out.println(babyR[3].getCol());
		
		// 늑대 두 마리 - blackW, quietW
		// "아우" true
		// "..." false
		
		Wolf blackW = new Wolf();
		Wolf silverW = new Wolf();
		
		blackW.setCol("black");
		silverW.setCol("silver");
		
		blackW.setSound("아우");
		silverW.setSound("...");
		
		blackW.setStatus(true);
		silverW.setStatus(false);
		
		System.out.println(blackW.getCol());
		System.out.println(silverW.getCol());
		System.out.println(blackW.getSound());
		System.out.println(silverW.getSound());
		System.out.println(blackW.isStatus());
		
		
	}
}
