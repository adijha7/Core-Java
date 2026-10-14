package JRE;

public class Employee {
	
	static String companyname="Qsipder";
	String name;
	String gender;
	int employeeid;
	
	
	static {
		System.out.println("Hello From Static Block ");
		System.out.println();
		
	}
	public static void companydetails() {
		System.out.println("Company Name is "+companyname);
	}

	public Employee(int employeeid ,String name ,String gender) {
		this.employeeid=employeeid;
		this.gender=gender;
		this.name=name;	
	}
	
	public void display() {
		System.out.println();
		System.out.println("Employee id "+employeeid);
		System.out.println("Employee name :"+name);
		System.out.println("Employee Gender is "+gender);
		System.out.println();
	}
	{
		System.out.println("Hello From Non Static Block");
		display();  
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Main Start ");
		companydetails();
		Employee e=new Employee(101,"Justin","Male");
		e.display();
		System.out.println("Main End");
		
	}
}
