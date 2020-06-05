package exam10;

public class Account {
	static double rateY; // 클래스 변수 -- 연간 이율
	int balance; // 인스턴스 변수 -- 현재 잔고
	int calBalForMonth(int balance) { // 인스턴스 메소드 -- 잔고 + 월별 이자
		balance += (int) (balance * (rateY / 12)); // 월별 이자를 더한 잔고
		return balance; // 반환값
	}
	public double SetRate(double rateY) { // 클래스 메소드 -- 이율 변경
		return rateY; 
	}
}

