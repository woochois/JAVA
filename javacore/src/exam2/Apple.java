package exam2;

import java.util.Scanner;

public class Apple {

//	1. 사과의 개수가 123개이고 이를 바구니에 담고자 한다 
//	바구니는 10개씩 담을 수 있다고 한다면 몇 개의 바구니가 필요한가? 자바프로그램을 작성하시오
	
	public static void main(String[] args) {
//		int apple = 123;
//		int basket = 10;
//		int res = apple/basket;
		
//		if 절
//		if(apple/basket != 0) System.out.println(apple/basket + 1);
//		else System.out.println(apple/basket);
		
//		삼항 연산자
//		int result = res != 0 ? res + 1 : res;
//		System.out.println("총 필요한 바구니의 수는 : " + result + "개");
		
//		응용 ) 입력받는 사과 개수에 따라 값 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 사과의 개수가 123개이고 이를 바구니에 담고자 한다 \r\n" + 
				"바구니는 10개씩 담을 수 있다고 한다면 몇 개의 바구니가 필요한가?");
		
		System.out.print("사과의 개수를 입력하시오 : ");
		int apple = scan.nextInt();
		int basket = 10;
		int result = apple/basket;
		
		System.out.println("입력된 사과의 개수 : " + apple);
		
//		if 절 응용
//		if(result != 0) System.out.println("총 필요한 바구니의 수는 : " + (result+1) + "개 입니다.");
//		else System.out.println("총 필요한 바구니의 수는 : " + (result) + "개 입니다.");

//		삼항연산자 응용
		int res = result != 0 ? result + 1 : result;
		System.out.println("총 필요한 바구니의 수는 : " + res + "개 입니다.");
		
		
		
		
		
		
	}

}
