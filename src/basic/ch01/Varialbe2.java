package basic.ch01;

public class Varialbe2 {

	//코드의 시작점
	public static void main(String[] args) {
		
		// 변수의 이름을 만들때 규칙이 존재
		
		// 1. 대소문자를 명확하게 구별해야하며 길이 제한이 없음
		// 값을 넣다 --> 초기화를 하다.
		int age = 10;
		int AGE = 20;
		int aGe = 30; // 변수 선언과 동시에 값을 넣다(초기화)
		
		// 2. 자바에서 지정한 예약어를 사용 할 수 없다.
		// int, double, if, for 등 <-- 예약어는 사용할수 없다.
		// int = for; <-- 에러 발생
		
		// 3. 변수는 숫자로 시작할수 없다.
		// int = 30age; <-- 오류 발생ㅜ
		// int = 20Man; <--
		
		// 4. 특수 문자는 _(언더바), $(달러) 표기만 사용가능
		int _count;
		int $_tel;
		int $count_test;
		// int *count; <-- 오류 발생
		
		// 권장 사항 - 변수 선언시 되도록 소문자 변수를 우선 사용
		
		// 변수 선언과 동시에 초기화도 가능
		int score = 10;
		int socre1, socre2 ,socre3; // 사용 가능하지만 권장(X)
		
	} // end of main
} // end of class
