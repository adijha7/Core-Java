package DecisionStatement;

public class NestedIfExample {
	public static void main(String[] args) {
		int a=55;
		if(a>=90 && a<=100  ) {
			System.out.println("Passed by A+ Grade");
		}
		else if(a>=80  && a<=89)
		{
			System.out.println("Passed by B+ Grade");
			
		}
		else if(a>=60 && a<=79 )
		{
			System.out.println("Passed By C+ Grade");
		}
		else {
			System.out.println("Failed ");
		}
	}

}
