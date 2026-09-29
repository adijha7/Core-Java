package Static_Member_Static_var;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student(02,"Dingi","Female",21,"Sql, Python");
		s1.Studentdata();
		System.out.println();
		Student.Display();
	}

}
