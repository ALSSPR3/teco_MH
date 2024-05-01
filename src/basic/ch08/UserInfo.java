package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	
	public UserInfo() {}
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}
	
	public UserInfo(String id, String name, String psw) {
		userId = id;
		userName = name;
		userPassWord = psw;
	}

	public UserInfo(String id, String name, String psw, String add) {
		userId = id;
		userName = name;
		userPassWord = psw;
		userAddress = add;
	}
	
	public UserInfo(String id, String name, String psw, String add, String num) {
		userId = id;
		userName = name;
		userPassWord = psw;
		phoneNumber = num;
	}
}
