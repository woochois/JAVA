package exam2;

public class Apple {

//	1. 사과의 개수가 123개이고 이를 바구니에 담고자 한다 
//	바구니는 10개씩 담을 수 있다고 한다면 몇 개의 바구니가 필요한가? 자바프로그램을 작성하시오
	
	public static void main(String[] args) {
		int apple = 123;
		int basket = 10;
		
		if(apple/basket != 0) System.out.println(apple/basket + 1);
		
	}

}
