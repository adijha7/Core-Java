package Static_Member_Static_Initialiazer;

public class Laptop {
	int id;
	String brand;
	String colour;
	double price;
	static String type;
	
	public Laptop() {
		System.out.println("Hello This is no Arugment ");
	}
	public Laptop(int id) {
		this();
		//System.out.println("Hello From 1-Arugment");
		this.id=id;
	}
	
    public Laptop(int id,String brand) {
	   this(id);
	  // System.out.println("Hello From 2 Arugment");
	   this.brand=brand;
	
}

        public  Laptop(int id, String brand,String colour) {
        	this(id,brand);
        	//System.out.println("Hello From 3 Arugment ");
        	this.colour=colour;
        }
        
        public  Laptop(int id, String brand,String colour,double price) {
        	this(id,brand,colour);
        	//System.out.println("Hello From 4 Arugment ");
        	this.price=price;
        }
        
        static {
        	// print 
        	// create declare local variable
        	// call the method
        	System.out.println("Hello From Laptop Class");
        }
        public void displaydata() {
        	System.out.println("The Laptop id :-"+id);
        	System.out.println("The Laptop brand :-"+brand);
        	System.out.println("The Laptop colour :-"+colour);
        	System.out.println("The Laptop price:-"+price);
        	System.out.println("The Laptop type :-"+type);
        }
        
}
