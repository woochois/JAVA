package com.hk.conditional;

import java.util.Scanner;

public class SelectMenu2 {

	public static void main(String[] args) {
		
		
		int menu = 0;
		String result = "선택안함";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("저녁에 먹고 싶은 메뉴 번호는 ? : ");
		menu = scan.nextInt();
		
		switch(menu) {
			case 1 : result = "중식 짜장면";
			break;
			case 2 : result = "일식 회덮밥";
			break;
			case 3 : result = "양식 돈까스";
			break;
			case 4 : result = "기타 스파게티";
			break;
			default : result = "선택안함";
		}
		System.out.println("오늘저녁식사는 ? : " + result);
	}

}
