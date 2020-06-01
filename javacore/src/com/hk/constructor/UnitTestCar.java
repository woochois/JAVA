package com.hk.constructor;

public class UnitTestCar {
	public static void main(String[] args) {
		// 기본 생성자로 redcar
			Car c = new Car();
			c.color = "red";
			
		// 일반 생성자로 blue ( c = blue )
			Car d = new Car("blue");
			
		// 일반 생성자로 gray ( c = gray, gear = "수동" )
			Car e = new Car("gray", "수동");
		
		// 일반 생성자로 black ( c = black, gear = "자동", 문 = 2 )
			Car f = new Car("black", "자동", 2);
	}
}
