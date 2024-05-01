package basic.ch04;

public class ForTable {

	// 코드의 시작점
	public static void main(String[] args) {

		int row;
		int column;

		for (column = 0; column < 3; column++) {
			for (row = 0; row < 3; row++) {
				System.out.print(row);
			}
			System.out.println("\n");
		}

	} // end of main

} // end of class
