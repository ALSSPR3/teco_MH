package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	//
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int maxNum = sc.nextInt();

		int sum = 0;
		for (int i = 2; i <= maxNum; i += 2) {
			sum += i;
		}
		System.out.println("짝수의 총합 : " + sum);

	}

}
