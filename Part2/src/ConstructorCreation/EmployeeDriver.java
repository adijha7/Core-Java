package ConstructorCreation;

public class EmployeeDriver {

    int employeeId;
    String employeeName;
    double employeeSalary;
    String employeeLocation;

    public EmployeeDriver(int id, String name, double salary, String location) {
        employeeId = id;
        employeeName = name;
        employeeSalary = salary;
        employeeLocation = location;
    }

    public static void main(String[] args) {

        EmployeeDriver emp1 = new EmployeeDriver(101, "Raju", 25000, "Pune");
        EmployeeDriver emp2 = new EmployeeDriver(102, "Kalya", 30000, "Mumbai");
        EmployeeDriver emp3 = new EmployeeDriver(103, "Priya", 28000, "Nagpur");
        EmployeeDriver emp4 = new EmployeeDriver(104, "Neha", 35000, "Delhi");

        System.out.println("Employee 1");
        System.out.println("ID: " + emp1.employeeId);
        System.out.println("Name: " + emp1.employeeName);
        System.out.println("Salary: " + emp1.employeeSalary);
        System.out.println("Location: " + emp1.employeeLocation);

        System.out.println();

        System.out.println("Employee 2");
        System.out.println("ID: " + emp2.employeeId);
        System.out.println("Name: " + emp2.employeeName);
        System.out.println("Salary: " + emp2.employeeSalary);
        System.out.println("Location: " + emp2.employeeLocation);

        System.out.println();

        System.out.println("Employee 3");
        System.out.println("ID: " + emp3.employeeId);
        System.out.println("Name: " + emp3.employeeName);
        System.out.println("Salary: " + emp3.employeeSalary);
        System.out.println("Location: " + emp3.employeeLocation);

        System.out.println();

        System.out.println("Employee 4");
        System.out.println("ID: " + emp4.employeeId);
        System.out.println("Name: " + emp4.employeeName);
        System.out.println("Salary: " + emp4.employeeSalary);
        System.out.println("Location: " + emp4.employeeLocation);
    }
}
