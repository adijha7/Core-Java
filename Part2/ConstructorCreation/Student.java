package ConstructorCreation;

public class Student {
	/*     
	No Argument Constructor
	 Access Modifier  Classname(Formal Argument )
	 {
	 
	 
	 }
	*/

	
	public Student() {
		
		System.out.println("Hello Student this is No Argument Constructor");
		int a=10;
		System.out.println(a);
		
		
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
	}
}
