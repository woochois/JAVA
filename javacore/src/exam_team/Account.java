package exam_team;

public class Account {
	//작성 위치
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;

	private int getBalance() {
		return balance;
	}

	private void setBalance(int a) {
		if(a >= MAX_BALANCE || a <= MIN_BALANCE) this.balance = balance;
		else this.balance = a;
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
	}
}
