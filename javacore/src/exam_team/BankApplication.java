package exam_team;

import java.util.Scanner;

public class BankApplication {

	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);
	
	// 계좌생성하기
	private static void createAccount() {
		// 작성 위치
		// 계좌번호 ano, 계좌주 owner, 초기입급액 balance, 결과
		System.out.println("----------\n계좌생성\n----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account2 ac2 = new Account2(ano, owner, balance); // 입력 받은 값 객체 생성
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = ac2; // 배열 주소에 입력 받은 3가지 값 삽입
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	// 계좌목록보기
	private static void accountList() {
		// 작성 위치
		// 계좌번호, 계좌주, 현재잔액
		System.out.println("----------\n계좌목록\n----------");
		for(int i = 0; i < accountArray.length; i++) {
			Account2 account2 = accountArray[i]; // 계좌 배열 객체 생성
			if(account2!=null) { // 계좌가 비어있지 않으면
				System.out.print(account2.getAno()); // 계좌번호 가져오기
				System.out.print("   ");
				System.out.print(account2.getOwner()); // 계좌주 가져오기
				System.out.print("   ");
				System.out.print(account2.getBalance()); // 잔액 가져오기
				System.out.println();
			}
		}
		
	}
	
	// 예금하기
	private static void deposit() {
		// 작성 위치
		// 계좌번호, 예금액, 결과
		System.out.println("----------\n예금\n----------\n");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("입금액: ");
		int money = scanner.nextInt();
		
		Account2 account2 = findAccount(ano); // 계좌번호 조회 객체
		if(account2 == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account2.setBalance(account2.getBalance() + money); // 입력받은 입금액과 가져온 잔액 더해서 출력
		System.out.println("결과: 입급이 성공되었습니다.");
		
	}
	
	// 출금하기
	private static void withdraw() {
		// 작성 위치
		// 계좌번호, 출금액, 결과
		System.out.println("----------\n출금\n----------\n");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		
		Account2 account2 = findAccount(ano); // 계좌번호 조회 객체
		if(account2 == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account2.setBalance(account2.getBalance() - money); // 입력받은 입금액과 가져온 잔액 빼서 출력
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	// Account2 배열에서 ano 와 동일한 Account2 객체 찾기
	private static Account2 findAccount(String ano) {
		// 작성 위치
		Account2 account2 = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) {
				String findAno = accountArray[i].getAno();
				if(findAno.equals(ano)) {
					account2 = accountArray[i];
					break;
				}
			}
		}
		return account2;
	}
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
