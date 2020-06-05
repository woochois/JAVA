package exam1;

import java.util.Scanner;

public class Scan2 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("반지름을 입력하시오.");
		int num1 = scan.nextInt();
		double result = num1 * num1 * 3.14;
		System.out.println("원의 면적은 " + result);
	}
}
