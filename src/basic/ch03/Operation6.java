package basic.ch03;

public class Operation6 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag1 : " + flag1);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println("flag2 : " + flag2);
		
		System.out.println("=====================");
		
		boolean	flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag3);
		
		System.out.println("======================");
		
		System.out.println("부정 논리 연산자 사용 : " + !flag3);	
		System.out.println("flag3 : " + flag3);
		
		
	} // end of main
} // end of class
