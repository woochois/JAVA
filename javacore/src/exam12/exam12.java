package exam12;

import java.util.Scanner;

public class exam12 {
	int hour, rate; // 시간, 시간당 단가

	exam12(){
		hour = 0;
		rate = 10000;
	}
	
	void calPay(){
		System.out.println("시급은 : " + (hour * rate) + "원");
	}
	
	protected int getHour() {
		return hour;
	}

	protected void setHour(int hour) {
		this.hour = hour;
	}

	protected int getRate() {
		return rate;
	}

	protected void setRate(int rate) {
		this.rate = rate;
	}
	
	protected void setRate(String id, String pw, int rate) {
		if(id.equals("admin") && pw.equals("8090")) this.rate = rate;
		else System.out.println("관리자만 변경가능합니다!!");
	}
	
	// 테스트
	public static void main(String[] args) {
		exam12 ex12 = new exam12();
		Scanner scan = new Scanner(System.in);
		// 일한 시간 입력
		System.out.print("오늘 일한 시간을 입력하시오. ");
		ex12.setHour(scan.nextInt());
		// 관리자  아이디 비밀번호 시급 조정
		System.out.println("아이디, 비밀번호, 시급을 입력하시오.");
		ex12.setRate(scan.next(), scan.next(), scan.nextInt());
		ex12.calPay();
		
	}
}
