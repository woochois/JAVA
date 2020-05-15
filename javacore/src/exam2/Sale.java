package exam2;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

//		선생님 코드
		System.out.println("간단한 POS 프로그램");
		
		int price = 100000, buy = 0;
		double sale = 0.1d , total = 0.0d;
		
		System.out.print("구매 수량은 ? : ");
		buy = scan.nextInt();
		
		double temp = price * buy;
		total = buy >= 10 ?  temp * (1 - sale) : price * buy;
		
		System.out.println("총 구매 가격 : " + (int)total + "원");
		
		scan.close();
		
//		if 절
//		int price = 100000;
//		System.out.println("제품의 가격은 100,000원입니다.\n10개 이상 구매 시, 10% 할인해드립니다.");
//		System.out.print("주문 수량을 입력해주세요. : ");
//		int quantity = scan.nextInt();
//		int total = price*quantity;
//		if(quantity >= 10) System.out.println("총 가격은 " + (total - total/10) + "원 입니다.\n할인된 금액은 " + (total/10) + "원 입니다.");
//		else System.out.println("총 가격은 " + total + "원 입니다.");
		
//		삼항연산자
//		int res = quantity >= 10 ? total-total/10 : total ;
//		System.out.println(res);

	}

}
