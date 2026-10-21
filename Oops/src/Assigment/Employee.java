package Assigment;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private double Salary ;
	
	private Employee(int id,String name,String designation,double Salary ) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.Salary=Salary;
	}
		
	public void setapp(int id,String name,String designation,double Salary ) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.Salary=Salary;
	}
	
	public int getid() {
		return id;
		
	}
	
	public  String getname() {
		return name;
		
	}
	
	public String getdes() {
		return designation;
	}

	public double getsal() {
		return Salary;
	}
	
	public void display() {
		System.out.println("Employee id :-"+id);
		System.out.println("Employee name :-"+name);
		System.out.println("Employee  Desgination:-"+designation);
		System.out.println("Employee Salary :-"+Salary);
		
	}
	
	public static Employee Remo(int id,String name,String designation,double Salary ) {

	    return new Employee(id,name,designation ,Salary );
	}
	
}
