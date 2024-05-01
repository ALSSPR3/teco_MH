package basic.ch03;

import java.util.Scanner;

public class Operation8 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		System.out.println("더 큰수 비교");
		
		Scanner sc = new Scanner(System.in);
				
		int x = sc.nextInt();
		System.out.println(" x 에 입력된 값은 : " + x);
		int y = sc.nextInt();
		System.out.println(" y 에 입력된 값은 : " + y);
		
		System.out.println("-------------------------");
		
		int max =  x>y ? x:y;
		
		System.out.println("더 큰 수는 " + max + " 입니다 ");
		
	} // end of main
} // end of class
