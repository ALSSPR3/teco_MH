package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("잘못된 입력");
		} else {
			this.hp = hp;
		}

	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power < 0) {
			System.out.println("잘못된 입력");
		} else {
			this.power = power;
		}
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public boolean isDie() {
		return isDie;
	}

	public void setDie(boolean isDie) {
		this.isDie = isDie;
	}

}
