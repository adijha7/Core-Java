package NonStaticmethod;

public class Student {
	int id;
	String name;
	int age;
	
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void Display() {
		System.out.println("Student id is :- "+id);
		System.out.println("Student name is :- "+name);
		System.out.println("Student age is :- "+age);
	}
	
	public static void main(String[] args) {
		Student s=new Student(131,"Dinga",22);
		System.out.println("The Student Details");
		s.Display();
		System.out.println();
		System.out.println("The Student Details");
		System.out.println("Student id is :- "+s.id);
		System.out.println("Student name is :- "+s.name);
		System.out.println("Student age is :- "+s.age);
	}
	}


