package com.hk.collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectEx2 {
	public static void main(String[] args) {
		do {
			try {
					Scanner scan = new Scanner(System.in);
					System.out.print("숫자를 입력하세요 : ");
					int num = scan.nextInt();
					System.out.println("입력한 값은 : " + num);
					scan.close();
					break;
				} catch (InputMismatchException e) {
					System.out.println("입력한 값은 정수가 아닙니다.");
				}
		}while(true);
	}
}
