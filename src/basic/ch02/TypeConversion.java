package basic.ch02;

public class TypeConversion {

	// 코드의 시작점
	public static void main(String[] args) {
		
		
		int intDataBox = 100;
		double doubleDataBox;
		
		doubleDataBox = intDataBox;
		
		System.out.println(doubleDataBox);
		
		System.out.println("-------------------");
		
		final double PI = 3.14159;
		int intBox = (int)PI;
		System.out.println(intBox);
		
		double interestRate;
		int discount;
		
		interestRate = 15.5;
		
		discount = (int)interestRate;
		System.out.println(discount);
		
		System.out.println((int)7.5);
		
		
	} // end of main
} // end of class
