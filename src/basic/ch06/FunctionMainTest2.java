package basic.ch06;

import java.util.Iterator;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		
		addNum(10,20,20);
		System.out.println(30);
		System.out.println(addNum(10,10,10));
		int result = addNum(10,10,10);
		System.out.println("result : " + result);
		System.out.println("-------------------");
		sayHello("안녕 반가워");
		int result2 = calcSum();
		System.out.println("result2 : " + result2);
	} // end of main
	
	static int addNum(int n1, int n2, int n3) {
		int result = 0;
		result = n1 + n2 + n2;
		return result;
	}
	
	static void sayHello(String greeting) {
		System.out.println(greeting + " ^^");
	}
	
	static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}
} // end of class
