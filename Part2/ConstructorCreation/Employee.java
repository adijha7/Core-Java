package ConstructorCreation;

public class Employee {
	int Employee_id;
	String Employee_name;
	Double Employee_salary;
	String Employee_Designation;
	String Department;
	String Reporting_manager;
	String Company_name;
	
	
	public Employee(int a,String b,Double c,String d,String e,String f,String g) 
	{
		Employee_id=a;
		Employee_name=b;
		Employee_salary=c;
		Employee_Designation=d;
		Department=e;
		Reporting_manager=f;
		Company_name=g;
		
	}
	public static void main(String[] args) {
		
		Employee e=new Employee(101,"Dinga",15000.0,"Software intern"," Testing","Dingi","Lala Company");
		System.out.println("Employee id is "+e.Employee_id);
		System.out.println("Employee name is "+e.Employee_name);
		System.out.println("Employee salary is"+e.Employee_salary);
		System.out.println("Employee Designation is "+e.Employee_Designation);
		System.out.println("Employee Department is "+e.Department);
		System.out.println("Employee Reporting is "+e.Reporting_manager);
		System.out.println("Company name is "+e.Company_name);
		
		
		
	}
	
	

}
