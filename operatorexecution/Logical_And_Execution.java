package operatorexecution;


public class LogicalExecution {

	public static void main(String[] args) {
		String Size="Small";
		int budget=700;
		
		String t1="Large";
		int price1=600;
		String t2="Xlarge";
		int price2=800;
		String t3="Medium";
		int price3=400;
		String t4="Small";
		int price4=650;
		String t5="Small";
		int price5=800;
		
		
//		Case 1
		Boolean Testcase1= Size==t1 && budget>=price1;
		System.out.println(Testcase1);
		
//		Case 2
		Boolean Testcase2= Size==t2 && budget>=price2;
		System.out.println(Testcase2);
		
//		Case 3
		Boolean Testcase3= Size==t3 && budget>=price3;
		System.out.println(Testcase3);
		
//		Case 4
		Boolean Testcase4= Size==t4 && budget>=price4;
		System.out.println(Testcase4);
		
//		Case 5
		Boolean Testcase5= Size==t5 && budget>=price5;
		System.out.println(Testcase5);
		
		
		
	}
}