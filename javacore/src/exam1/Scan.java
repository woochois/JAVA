package exam1;

import java.util.Scanner;

public class Scan {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		int num1 = scan.nextInt();
		System.out.print("정수를 입력하시오");
		int num2 = scan.nextInt();
		int result = num1 * num2;
		System.out.println(result);
	}
}
