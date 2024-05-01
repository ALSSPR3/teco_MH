package basic.ch08;

public class Student {

	String name;
	int number;
	int grade;
	
	public Student() {}
	
	public Student(String s, int n1, int n2) {		
		name = s;
		number = n1;
		grade = n2;
		showInfo();
	}
	
	public void showInfo() {
		System.out.println("학생의 이름은 : " + name);
		System.out.println("학생의 번호은 : " + number);
		System.out.println("학생의 학년은 : " + grade);
		
	}
	
	
}
