package basic.ch03;

public class Operation7 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int number = 5;
		int index = 0;
		
		boolean result = ((number = number + 10) < 10) && ((index = index +2 ) < 10);
		System.out.println("현재 number 변수의 값은 : " + number);
		System.out.println("현재 index 변수의 값은 : " + index);
		
		System.out.println("=============================");
		
		number = 5;
		
		result = ((number += 10) < 10) || ((index += 2) < 10);
		
		System.out.println("현재 number 변수의 값은 : " + number);
		System.out.println("현재 index 변수의 값은 : " + index);
		
		number = 5;
		index = 0;
		
		result = ( (index += 2) < 10 ) || ( (number += 10) < 10 );
		
		System.out.println("현재 index 변수의 값은 : " + index);
		System.out.println("현재 number 변수의 값은 : " + number);
	} // end of main
} // end of class
