package basic.ch09;

import java.util.Iterator;
import java.util.Scanner;

public class MainTest {

	// 코드의 시작점 --> 실행에 흐름을 만들 수 있다.
	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("작은오크", 10);
		Warrior warrior2 = new Warrior("큰오크", 30);
		
		Wizard wizard1 = new Wizard("7급마법사", 20);

		System.out.println("전사가 마법사를 몇번 공격 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		
		for (int i = 0; i < inputData; i++) {
			warrior1.attackWizard(wizard1);
		}
		
		System.out.println("마법사 hp 확인 : " + wizard1.hp);
	} // end of main

} // end of class
