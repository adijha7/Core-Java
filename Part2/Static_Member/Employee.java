package Static_Member;

public class Employee {
	int id;
	String name;
	String Designation;
	double salary;
	 static String company_name;
	 
	 
	 public Employee(int id, String name ,String Designation,double salary) {
		 this.id=id;
		 this.name=name;
		 this.Designation=Designation;
		 this.salary=salary;
		 
	 }
	 
	 public void DisplayEmployee() {
		 System.out.println("----------------- Employee Details -----------------");
		 System.out.println("Employee id :"+id);
		 System.out.println("Employee name : "+ name);
		 System.out.println("Employee Designation "+Designation);
		 System.out.println("Employeee Salary :"+salary);
		 System.out.println("Employee Company_Name :"+company_name);
	 }
	 
	 public static void Displaydata() {
		 System.out.println("Employee Company_Name :"+company_name);
		 
		 Employee e=new Employee(101,"Aditya","Tester",60000);
		 System.out.println("----------------- Employee Details -----------------");
		 System.out.println("Employee id :"+e.id);
		 System.out.println("Employee name : "+ e.name);
		 System.out.println("Employee Designation "+e.Designation);
		 System.out.println("Employeee Salary :"+e.salary);
		 
	 }

}
