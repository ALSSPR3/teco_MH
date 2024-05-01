package basic.ch09;

public class Wizard {

	String name;
	int power;
	int hp;

	public Wizard(String myName, int myPower) {
		this.name = myName;
		this.power = myPower;
		hp = 50;
	}

	// 전사를 공격하다.
	public void attackWarrior(Warrior warrior) {
		warrior.beAttacked(this.power);
	}

	// 내가 공격을 받다.
	public void beAttacked(int power) {
		// 방어적 코드
		if (hp <= 0) {
			System.out.println("이미 죽었습니다");
			return; // 실행에 흐름 반환
		}
		hp = hp - power;
	}
}
