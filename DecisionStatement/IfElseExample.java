package DecisionStatement;

public class IfElseExample {
	public static void main(String[] args) {
		String Username="admin";
		String Password="admin@123";
		
		if(Username=="admin"&& Password=="admin@123") {
			System.out.println("Login Succesfull");
		}
		else {
			System.err.println("Invalid data enter by user");
//			System.out.println("Invalid data enter by user");
		}
	}

}