package basic.ch08;

public class StudnetMainTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 101, 3);
		
		Student s2 = new Student("아무개", 102, 4);
		
		Student s3 = new Student();
		s3.name = " 김무개";
		s3.number = 103;
		s3.grade = 1;
		s3.showInfo();
	}
}
