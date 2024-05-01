package basic.ch07;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;
	
	public boolean checkPassword(String inputPwd) {
		if (password.equals(inputPwd)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void passwordCheck(String inputPwd) {
		boolean result = password.equals(inputPwd);
		if (result == true) {
			System.out.println("비밀번호가 맞습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.password = "123";
		
		User user2 = new User();
		user2.password = "555";
		
		boolean user1Result = user1.checkPassword("333");
		System.out.println("user1 : " + user1Result);
		boolean user1Result2 = user1.checkPassword("123");
		System.out.println("user1 두번째 결과 : " + user1Result2);
		
		System.out.println("------------------------");
		
		boolean user2Resutl = user2.checkPassword("333");
		System.out.println("user2 : " + user2Resutl);
		boolean user2Result2 = user2.checkPassword("555");
		System.out.println("user2 두번째 결과 : "+ user2Result2);
		
		System.out.println("--------------------");
		user2.passwordCheck("555");
		System.out.println("--------------------");
		user2.passwordCheck("333");
	}
}
