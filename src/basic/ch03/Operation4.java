package basic.ch03;

public class Operation4 {

	//코드의 시작점
	public static void main(String[] args) {
		
		int score = 5;
		
		score += 10;
		System.out.println(score);
		
		System.out.println("-----------");
		
		int n1 = 100;
		n1 += 10;
		System.out.println("n1 : " + n1);
		
		score -= 10;
		
		score *= 2;
		
		score /= 2;
		
		score %= 2;
		System.out.println("score : " + score);
	} // end of main
} // end of class
