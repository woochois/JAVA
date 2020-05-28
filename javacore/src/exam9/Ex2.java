package exam9;

import java.util.Scanner;

public class Ex2 {
	/*
	2. 구구단의 단을 입력 받아서 출력하는 gugudan(int dan)함수를 작
	성하고 main함수에서 사용하라
	출력할 단은: 3
	3 * 1 = 3
	3 * 2 = 6
	3 * 3 = 9
	3 * 4 = 12
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 단은 : ");
		System.out.print(gugudan(scan.nextInt()));
	}
	
	static int gugudan(int a) {
		for(int i = a; i < a + 1; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(a + " * " + j + " = " + (i * j));
			}
		}
		return 0;
	}
}
