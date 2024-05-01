package basic.ch03;

public class Operation3 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int value1 = 1;
		++value1;
		
		System.out.println(value1);
		
		int value2 = 1;
		value2--;
		
		System.out.println(value2);
		
		int intData1 = 10;
		int resulteData;
		
		resulteData = intData1++;
		System.out.println(resulteData);
		System.out.println(intData1);
		
		int intData2 = 100;
		int resulteData2;
		
		resulteData2 = ++intData2;
		System.out.println(resulteData2);
	} // end of main
} // end of class
