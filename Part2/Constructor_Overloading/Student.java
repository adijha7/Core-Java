package Constructor_Overloading;

public class Student {
	int student_id;
	String student_name;
	String student_gender;
	int student_age;
	
	
	 public Student() {
		 System.out.println("Hello From No Argument Constructor");
	 }
	 
	 public Student(int student_id, String student_name) {
		 this.student_id=student_id;
		 this.student_name=student_name;
		 
	 }
	 
	 public Student( String student_gender,int student_age) {
		 this.student_gender=student_gender;
		 this.student_age=student_age;
		 
	 }
	 
	 public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		
		System.out.println();
		Student s1=new Student(12,"Dinga");
		System.out.println("The Student id is :"+s1.student_id);
		System.out.println("The Studnet name is :"+s1.student_name);
		
		System.out.println();
		Student s2=new Student("Male",20);
		System.out.println("The Student Gender is :"+s2.student_gender);
		System.out.println("The Studnet Age is :"+s2.student_age);

	}
}
