package com.hk.modifier;

public class Zoo {
	public static void main(String[] args) {
		System.out.println("서울대공원에 오신 것을 환영합니다.");
		System.out.println("------------------------");
		
		Animal lion = new Animal();
		System.out.println("사자 다리 = " + lion.getLeg());
		// System.out.println("사자 다리 = " + lion.leg); // 에러. 제어자가 private 이기 때문에 외부 접근 불가
		
		// lion.setFood("햄버거"); // 에러. 제어자가 private 이기 때문에 외부 접근 불가
		lion.setMyFood("햄버거"); // pulbic 새로운생성자를 생성해서 호출했기 때문에 외부접근 가능
		System.out.println("사자 먹이 = " + lion.getFood());
		
	}
}
