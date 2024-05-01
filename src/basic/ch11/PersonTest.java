package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		
		Person personLee = new Person("이순신", 101);
		
		personBox2.setName("티모");
		person1.showInfo();
		System.out.println(personBox.getName());
		
	}
}
