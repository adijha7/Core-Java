package Static_Member_Static_Initialiazer;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop.type="Electronics";
		
		Laptop l=new Laptop(101,"HP","BLACK",60000);
		l.displaydata();
	}
	
	static {
		System.out.println("Hello From Laptop Driver Class");
		
	}

}
