package NonStaticVariables;

public class Student {
	int id;
	String name;
	int age;
	String gender;
	
	public static void main(String[] args) {
	System.out.println("---------- s1------------------");
		Student s1=new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		System.out.println("----------------------------");
		
		s1.id=101;
		s1.name="Om";
		s1.age=22;
		s1.gender="Male";
		
		System.out.println("Student id "+s1.id);
		System.out.println("Student Name "+s1.name);
		System.out.println("Student age "+s1.age);
		System.out.println("Student Gender"+s1.gender);
		
System.out.println("---------- s2------------------");
      Student s2=new Student();
      System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.gender);
		
		System.out.println("----------------------------");
		s2.id=102;
		s2.name="Mohan";
		s2.age=24;
		s2.gender="Male";
		
		System.out.println("Student id "+s2.id);
		System.out.println("Student Name "+s2.name);
		System.out.println("Student age "+s2.age);
		System.out.println("Student Gender"+s2.gender);
		
		System.out.println("---------- s3------------------");
	      Student s3=new Student();
	      System.out.println("Student id "+s3.id);
			System.out.println("Student Name "+s3.name);
			System.out.println("Student age "+s3.age);
			System.out.println("Student Gender"+s3.gender);
			
	  System.out.println("----------------------------");
			s3.id=103;
			s3.name="Dinga";
			s3.age=23;
			s3.gender="Male";
			
			System.out.println(s3.id);
			System.out.println(s3.name);
			System.out.println(s3.age);
			System.out.println(s3.gender);
			
			System.out.println("---------- s4------------------");
		      Student s4=new Student();
		      System.out.println(s4.id);
				System.out.println(s4.name);
				System.out.println(s4.age);
				System.out.println(s4.gender);
				
		  System.out.println("----------------------------");
				s4.id=103;
				s4.name="Dingi";
				s4.age=21;
				s4.gender="Female";
				
				System.out.println(s4.id);
				System.out.println(s4.name);
				System.out.println(s4.age);
				System.out.println(s4.gender);
		
		
		
		
		
		
		
		
	}

}
