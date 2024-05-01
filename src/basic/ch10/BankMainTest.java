package basic.ch10;

public class BankMainTest {

	// 코드의 시작점
	public static void main(String[] args) {
	
		Bank bank1 = new Bank();
		
		bank1.name = "우리은행";
		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(10_000); // 리턴 타입이 --> int
		System.out.println(">>>>> 출금 >>>>>");
		System.out.println("금액 : " + getMoney);
		
		
		
	} // end of main
	
} // end of class
