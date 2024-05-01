package basic.ch11;

public class Person {

	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String phone) {
		this(name, age);
		this.phone = phone;
	}
	public Person(String name, int age, int phone, String gender) {
		this(name, age, gender);
		this.gender = gender;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
