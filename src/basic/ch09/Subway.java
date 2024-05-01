package basic.ch09;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway (int line) {
		lineNumber = line;
	}
	
	public void take(int pay) {
		money += pay;
		passengerCount++;
	}
	
	public void drop() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("지하철 번호 : " + lineNumber);
		System.out.println("지하철 승객 수 : " + passengerCount);
		System.out.println("지하철 수익금 : " + money);
	}
}
