package basic.ch05;

public class WarriorMainTest {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior();
		Warrior warrior2 = new Warrior();
		
		warrior1.name = "티모";
		warrior1.health = 100;
		warrior1.attackPower = 30;
		warrior1.defensePower = 1;
		
		System.out.println("--------------");
		
		warrior2.name = "야스오";
		warrior2.health = 120;
		warrior2.attackPower = 20;
		warrior2.defensePower = 2;
		
		System.out.println("-----------------------------");
		System.out.println(warrior1.name);
		System.out.println(warrior2.name);
	}
}
