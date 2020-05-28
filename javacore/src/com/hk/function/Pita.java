package com.hk.function;

import java.io.IOException;

public class Pita {

	public static void main(String[] args) {
		
		int a, b = 0;
		double c = 0.0d; // 거리구할 때
		
		a = 10;
		b = 5;
		c = Math.sqrt(a*a + b*b); // 제곱근 구하기
		
		System.out.println("빗변의 길이는 " + c);
		
		int x, y = 0;
		double z = 0.0d;
		
		// 함수 이용
		x = 40;
		y = 20;
		z = distance(x,y);
		System.out.println("빗변의 길이는 " + z);
		System.out.println(distance(x,y));
	}
	
	
	// 피타고라스 빗변 구하는 공식
	public static double distance(int a, int b) {
		double result = 0.0d;
		result = Math.sqrt(a*a + b*b);
		return result;
	}
	
	
	
	public final static void clearConsole() { // 화면 지우는 함수
		try {
			// 윈도우계열 플랫폼
			if(System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			// 유닉스(맥), 리눅스(free 유닉스)
			else Runtime.getRuntime().exec("clear");
		} catch(IOException | InterruptedException ex) {} 
	}
}
