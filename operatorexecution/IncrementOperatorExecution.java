package operatorexecution;

public class IncrementOperatorExecution {
	public static void main(String[] args) {
		
//		Post Increment
		int a=10;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------------------------------------");
		
//		Pre Increment
		int c=10;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		
		
//		Assignment
		int a1=10;
		int b1=-5;
		int c1=21;
		int d1=a;
		
		int sum =a1 + ++a - d1++ - c++ + b1-- + --a1 + d1-- + ++c1;
		System.out.println(sum);
		
	}

}

