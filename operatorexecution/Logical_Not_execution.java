package operatorexecution;

public class Logical_Not_execution {
    public static void main(String[] args) {
		String shoe1="Nike";
		String shoe2="Puma";
		
		boolean Testcase1=!(shoe1=="Nike"|| shoe2=="Nike");
		System.out.println(Testcase1);
		
		boolean Testcase2=!(shoe1=="Puma"|| shoe2=="Puma");
		System.out.println(Testcase2);
		
		boolean Testcase3=!(shoe1=="Adidas"|| shoe2=="Adidas");
		System.out.println(Testcase3);
		
		boolean Testcase4=!(shoe1=="New Balance"|| shoe2=="New Balance");
		System.out.println(Testcase4);
		
		
		
	}
    
}
