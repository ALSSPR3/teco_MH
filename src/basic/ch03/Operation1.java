package basic.ch03;

public class Operation1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		
		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("------------");
		System.out.println(intData);
		
		intData = -intData;
		System.out.println(intData);

		int oneStepDistance = 1;
		final int ZEOR_POINT = 0;
		int currentPostion = 0;
		
		currentPostion = ZEOR_POINT - (oneStepDistance * 3);
		
		System.out.println(currentPostion);
		
		System.out.println("Math 라이브러리 사용 : " + Math.abs(currentPostion));
	} // end of main
} // end of class
