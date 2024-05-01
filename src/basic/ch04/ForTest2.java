package basic.ch04;

public class ForTest2 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		int num;
		
		for(num = 2; num<10; num++) {
			for(int i = 1; i<10; i++) {
				System.out.println(num + " * "+ i +" = " + (num * i));
			}
			System.out.println("-------------------------");
		}

	} // end of main

} // end of class
