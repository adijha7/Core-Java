package Static_Member;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee.company_name="Qspider";
		
		Employee e1= new Employee(102,"Mukul","Developer",50000);
		e1.DisplayEmployee();
		
		System.out.println();
		Employee.Displaydata();
		e1.Displaydata();
	}

}
