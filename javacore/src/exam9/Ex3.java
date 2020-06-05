package exam9;

import java.util.Scanner;

public class Ex3 {
	/*
	3. 정수값을 매개변수로 하여 절대값을 구하는 매크로 함수
	myABS(int num)를 작성하여 정수값을 입력받아 결과를 출력하는
	프로그램을 작성하시오.
	입력값: -10
	결과값: 10
	*/
	
	static int myABS(int num) {
		num = Math.abs(num);
		System.out.print("입력하신 정수의 절대값은 : ");
		return num;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수값을 입력하시오. : ");
		System.out.print(myABS(scan.nextInt()));
	}
	
}
