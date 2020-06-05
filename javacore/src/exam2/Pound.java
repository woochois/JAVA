package exam2;

import java.util.Scanner;

public class Pound {

//	2. 1파운드는 정확히 0.45359237 킬로그램(kg) 파운드를 Kg로 변환하는 자바 프로그램을 작성하시오
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double p1 = 0.45359237;
		System.out.println("파운드를 kg으로 변환시키는 프로그램");
		System.out.print("파운드를 입력하시오. : ");
		int kg = scan.nextInt();
	
		double res = p1 * kg;
		
		System.out.println(kg + "파운드는 " + res +"kg");
		
	}

}
