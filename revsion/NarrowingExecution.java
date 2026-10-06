package TypeCastingExecution;

public class NarrowingExecution {
	public static void main(String[] args) {
		
		double d=10.0;
		int a=(int)d;
		System.out.println("Largest Value :-"+d);
		System.out.println("Smallest Value :- "+a);
		
		
		System.out.println("--------------------------------------------");
		char ch='A';
		short s=(short)ch;
		System.out.println("Largest Value :-"+ch);
		System.out.println("Smallest Value :- "+s);
		
	}

}
