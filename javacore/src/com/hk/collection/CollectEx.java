package com.hk.collection;

import java.util.Scanner;

public class CollectEx {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				Scanner scan = new Scanner(System.in);
				System.out.print("임의의 정수변수를 입력하시오 : ");
				int num = scan.nextInt();
				int n = (int) (Math.random() * 10);
				double res = num / n;
				System.out.println("입력한 수 : " + num + "랜덤 수 : " + n);
				System.out.println("계산결과 : " + res);
			}
		} catch (ArithmeticException e) {
			System.out.println("계산불가능");
		}
	}
}
