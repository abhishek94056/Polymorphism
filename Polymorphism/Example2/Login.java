package Example2;

public class Login {
	public void login(long phoneNo) {
		System.out.println("Login using phone number");
	}


	public void login(String username, String password) {
		System.out.println("Login using email id and password");
	}
	
	public void login(String googleAccount) {
		System.out.println("Login using Google account");
	}


}
