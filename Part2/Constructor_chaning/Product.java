package Constructor_chaning;

public class Product {
	int pid;
	String pname;
	String pmodel;
	double price;
	
	Product(){
		System.out.println("This is No Argument");
	}
	
	Product(int pid){
		this();
		System.out.println("This is 1-Argument");
	}
	
	Product(int pid,String pname){
		this(pid);
		System.out.println("This is 2-Argument");
		this.pname=pname;
	}
	Product(int pid,String pname, String pmodel){
		this(pid,pname);
		System.out.println("This is 3- Argument");
		this.pmodel=pmodel;
		
	}
	Product(int pid,String pname, String pmodel,double price){
		this(pid,pname,pmodel);
		System.out.println(" This is 4 - Arugment");
		this.price=price;
		
	}
public static void main(String[] args) {
	Product p=new Product(101,"Biscut","Cream",25000);
	System.out.println(p.pid);
}
}
