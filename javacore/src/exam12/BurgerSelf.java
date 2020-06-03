package exam12;
import java.util.Scanner;

public class BurgerSelf extends FoodSelf{
	
	String side, drink;
	boolean isSet;
		
	// 세트 메뉴 시, 20% 할인된 가격
	void setPrice(int price) {
		
		System.out.println((int) (price * 0.8));
	}
	
	// 단품 이름과 가격 초기화하는 생성자
	void reset(String name, int price){
		this.name = name;
		this.price = price;
		System.out.println(name + "," + price);
	}
	
	public static void main(String[] args) {
		BurgerSelf bs = new BurgerSelf();
		Scanner scan = new Scanner(System.in);
		System.out.println("세트버거인지 아닌 지 입력하시오. ");
		bs.isSet = scan.nextBoolean();
		// 세트 메뉴 확인
		if(bs.isSet == false) bs.reset("치즈버거", 10000);
		else bs.setPrice(10000);
	}
}
