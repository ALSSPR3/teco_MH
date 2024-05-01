package basic.ch05;

public class StudentProgram2 {

	public static void main(String[] args) {
		int n1 = 1;
		double d1 = 5.0;
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "홍길동";
		System.out.println(student1.name);
		student2.name = "이순신";
		System.out.println(student2.name);
		
		System.out.println(student1);
		System.out.println(student2);
	}
}
