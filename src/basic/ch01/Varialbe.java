package basic.ch01;

public class Varialbe {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 변수를 활용하는 3가지 유형
		// 1. 변수 선언
		int ageBox; // 정수가 담긴 변수 선언
		int telBox; // 정수가 담긴 변수 선언
		
		// 2. 변수의 값 넣기
		ageBox = 30;
		telBox = 300;
		
		// 3. 변수 사용하기
		System.out.println(ageBox);
		ageBox = telBox;
		
		System.out.println("after --> ageBox : " + ageBox);
		System.out.println("-----------------------");
		System.out.println(telBox);
		

	} // end of main

} // end of class
