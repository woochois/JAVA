package exam2;

import java.util.Scanner;

public class Triple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력한 수가 양수인 지, 음수인 지 알아보는  프로그램");
		System.out.print("수를 입력하시오. : ");
		int x = scan.nextInt();
		
		String res = x >= 0 ? "양수" : "음수";
		
		System.out.println("정답은 " + res);

	}

}
