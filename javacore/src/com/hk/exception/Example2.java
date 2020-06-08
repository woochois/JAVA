package com.hk.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try { // 사용자의 예외를 예측하는 것
				Scanner scan = new Scanner(System.in);
				input = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("유요하지 않은 값입니다. 다시 값을 입력하ㅐ주세요.");
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
		}while(1 <= input || input >= 100);
	}
}