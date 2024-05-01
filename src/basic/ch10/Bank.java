package basic.ch10;

public class Bank {

	String name;
	int balance;

	// 입금
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	}

	// 출금
	public int withdraw(int money) {
		if (balance < money) {
			System.out.println("잘못된 접근입니다.");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money;
	}

	// 계좌 정보
	private void showInfo() {
		System.out.println("남은 잔액 : " + balance);
	}
}
