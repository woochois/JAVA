package com.hk.modifier;

public class Zoo {
	public static void main(String[] args) {
		System.out.println("서울대공원에 오신 것을 환영합니다.");
		System.out.println("------------------------");
		
		Animal lion = new Animal();
		System.out.println("사자 다리 = " + lion.getLeg());
	}
}
