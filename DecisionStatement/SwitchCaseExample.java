package DecisionStatement;

public class SwitchCaseExample {
	public static void main(String[] args) {
		int num=7;
		switch(num%2) {
		case 0 :
			System.out.println("Even Number "+num);
			break;
		case 1:
			System.out.println("Odd Number "+num);
			break;
		}
	}

}