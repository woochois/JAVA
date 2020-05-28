package com.hk.function;

public class Card { // 트럼프 카드
	
	// 속성 -- 인스턴스 변수(변동값)
	String kind; // 'spade' 'clover' 'heart' 'diamond'
	int number; // 1 ~ 10
	
	// 동작(행동) -- 클래스 변수(고정값)
	static int width = 100; // 폭 (가로)
	static int height = 250; // 높이 (세로)
	
	// 행동 { 지역 변수 }, 동작 { 지역 변수 } -- 괄호를 벗어나면 사라져!
	
	// main
	public static void main(String[] args) {
		Card spade = new Card();
		Card clover = new Card();
		Card heart = new Card();
		Card diamond = new Card();
		
	}
}
