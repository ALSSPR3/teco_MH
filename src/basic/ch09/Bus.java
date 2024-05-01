package basic.ch09;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int number) {
		busNumber = number;
	}
	
	public void take(int pay) {
		money += pay;
		passengerCount++;
	}
	
	public void drop() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객 수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}
}
