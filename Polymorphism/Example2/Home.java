package Example2;

public class Home {
	//method overloading

	public static void main(String[] args) {
		Login l = new Login();
		l.login(7040088515L);
		l.login("abhishek@gmail.com");
		l.login("abhishek94056", "Pass@123");

	}

}
