package com.hk.vo;

public class PrintMethod {
	public static void main(String[] args) {
		
		// 츨략하고 싶은 변수
		int score = 100;
		String name = "김건우";
		boolean military = true;
		
		System.out.println(score); // 매개변수 타입이 있음
		System.out.println(name);
		System.out.println(military);
		
	}
	
	
	// 매개변수의 이름이 다른 것은 오버로딩이 아니다.
/*	public void add(int x, int y) {
	
	}
	public void add(int a, int b) {
		
	}
*/	
	// 매개변수의 타입이 다르기 때문에 오버로딩이다.
	public void add(int x, long y) {
		
	}
	public void add(long a, int b) {
		
	}
	public void add(int[] a) {
		
	}
	
}
