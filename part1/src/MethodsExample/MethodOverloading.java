package MethodsExample;

public class MethodOverloading {

	public static void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void add(int a,int b,int c,int d) {
		int sum=a+b+c+d;
		System.out.println(sum);
	}
	public static void add(char c ) {
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add('a','b');
		add((char)98);
	}

	
	

}
