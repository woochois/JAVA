package exam2;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price = 100000;
		System.out.println("제품의 가격은 100,000원입니다.\n10개 이상 구매 시, 10% 할인해드립니다.");
		System.out.print("주문 수량을 입력해주세요. : ");
		int quantity = scan.nextInt();
		int total = price*quantity;
		if(quantity >= 10) System.out.println("총 가격은 " + (total - total/10) + "원 입니다.");
		if(quantity >= 10) System.out.println("할인된 금액은 " + (total/10) + "원 입니다.");
		else System.out.println("총 가격은 " + total + "원 입니다.");

	}

}
