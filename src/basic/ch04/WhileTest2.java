package basic.ch04;

public class WhileTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		boolean flag = true;
		int start = 0;
		int end = 3;
		
		while (flag) {
			if(start == end) {
				System.out.println("if 구문이 동작");
				flag = false;
				return;
			}
			start++;
			System.out.println("start : " + start);
		}
		
	} // end of main

} // end of class
