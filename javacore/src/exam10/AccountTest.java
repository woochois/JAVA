package exam10;

public class AccountTest {
		public static void main(String[] args) {
			Account ac = new Account();
			
			int kakaoB = 10000; 
			int naverB = 20000;

			ac.rateY = ac.SetRate(0.05); // 연이율 5%
			kakaoB = ac.calBalForMonth(kakaoB); // 첫 달 이자 포함 잔액 
			naverB = ac.calBalForMonth(naverB); // 첫 달 이자 포함 잔액 
			System.out.println(kakaoB + " " + naverB);
			
			ac.rateY = ac.SetRate(0.06); // 연이율 6%
			kakaoB = ac.calBalForMonth(kakaoB); // 두 번째 달 이자 포함 잔액
			naverB = ac.calBalForMonth(naverB); // 두 번째 달 이자 포함 잔액
			System.out.println(kakaoB + " " + naverB);
			
			// 월 이자 : 연이율 / 12;
			// 첫 달 이자 포함 잔액 - 10,041 / 20,083
			// 두 번째 달 이자 포함 잔액 - 10,091 / 20,183
			
		}	
}
