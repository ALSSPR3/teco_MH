package basic.ch02;

public class Constant {

	// 코드의 시작점
	public static void main(String[] args) {
		
		final int MAX_NUM = 10;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println("----------------------");
		
		final double PI = 3.14159;
		final int RADIUS = 10;
		
		System.out.println(2*PI*RADIUS);
		System.out.println(PI*(RADIUS*RADIUS));
		
	} // end of main
} // end of class
