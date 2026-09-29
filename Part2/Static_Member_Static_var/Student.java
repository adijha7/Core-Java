package Static_Member_Static_var;

public class Student {
	int id;
	String name;
	String Gender;
	int age;
	String Subject;
	static String School_name;
	
	public Student(int id,String name,String Gender,int age,String Subject) {
		this.id=id;
		this.name=name;
		this.Gender=Gender;
		this.age=age;
		this.Subject=Subject;
		
	}
	
	public void Studentdata() {
		System.out.println("---------- Student Details ----------");
		System.out.println("Student id :"+id);
		System.out.println("Student name :"+name);
		System.out.println("Student Gende :r"+Gender);
		System.out.println("Student Age: "+age);
		System.out.println("Student Subject :"+Subject);
		System.out.println("Student School_name :"+School_name);
	}
	
	public static void Display() {
		
		Student s=new Student (01,"Dinga ","Male",20,"Java,Sql");
		System.out.println("Student id :"+s.id);
		System.out.println("Student name :"+s.name);
		System.out.println("Student Gende :r"+s.Gender);
		System.out.println("Student Age: "+s.age);
		System.out.println("Student Subject :"+s.Subject);
		System.out.println("Student School_name :"+School_name);
	}

}
