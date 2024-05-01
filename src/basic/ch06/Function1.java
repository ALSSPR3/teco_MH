package basic.ch06;

public class Function1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		
		add(10,10);
		System.out.println(calcSum(10, 20));
	}
	
	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	static int calcSum(int s1, int s2) {
		int sum = 0;
		for (int i = s1	; i < s2; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
