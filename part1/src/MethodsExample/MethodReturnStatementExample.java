package MethodsExample;

public class MethodReturnStatementExample {
	public static int add(int a,int b) {
		//System.out.println(a+b);
		return a+b;
		
	}
	public static void main(String[] args) {
		int sum=add(10,20);
		System.out.println(sum);
		System.out.println(add(10,20));
	}

}
