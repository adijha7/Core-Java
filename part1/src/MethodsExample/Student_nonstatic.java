package MethodsExample;

public class Student_nonstatic {
	public void m1() {
		System.out.println("Hello from m1() From non static ");
	}
	public static void main(String[] args) {
		Student_nonstatic a= new Student_nonstatic();
		a.m1();
	}

}
