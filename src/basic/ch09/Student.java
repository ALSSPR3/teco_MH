package basic.ch09;

public class Student {

	String name;
	int money;
	
	public Student(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1500);
		money = money - 1500;
	}
	
	public void takeSubWay(Subway subway) {
		subway.take(1100);
		money = money - 1100;
	}
	
	public void dropBus(Bus bus) {
		bus.drop();
	}
	
	public void dropSubway(Subway subway) {
		subway.drop();
	}
	
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("소지금 : " + money);
	}
}
