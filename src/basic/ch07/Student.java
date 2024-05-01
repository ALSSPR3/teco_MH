package basic.ch07;

public class Student {

	int studentID;
	String studentName;
	String address;
	
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다");
	}
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식를 합니다");
	}
	
	public void showInfo() {
		System.out.println("---------상태창---------");
		System.out.println("학생 ID : "+ studentID);
		System.out.println("학생 이름 : "+ studentName);
		System.out.println("학생 주소 : "+ address);
	}
	
	public void taketest() {
		System.out.println(studentName + "학생이 시험을 친다");
	}
	
	public void cleanUp() {
		System.out.println(studentName + "학생이 청소를 한다.");
	}
}
