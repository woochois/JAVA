package exam1;

import java.util.Scanner;

public class Scan3 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int num1 = scan.nextInt();
		System.out.print("정수를 입력하시오.");
		int num2 = scan.nextInt();
		double result1 = num1 % 2;
		double result2 = num2 % 3;
		System.out.println(result1);
		System.out.println(result2);

	}

}
