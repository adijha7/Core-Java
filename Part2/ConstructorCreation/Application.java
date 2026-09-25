package ConstructorCreation;

public class Application {
	int Application_id;
	String Application_name;
	String Application_type;
	String User_name;
	String User_email;
	
	
	public Application(int Application_id,String Application_name,String Application_type,String User_name,String User_email) {
		this.Application_id=Application_id;
		this.Application_name=Application_name;
		this.Application_type=Application_type;
		this.User_name=User_name;
		this.User_email=User_email;
		
		
	}
	
	
     public static void main(String[] args)
     {
	System.out.println("-------------The Details of Application is -----------------------------");
    	 Application a=new Application(115,"Iphone","Mobile","Raju","Raju21@gmail.com");
    	 System.out.println("The Application Id  is "+a.Application_id);
    	 System.out.println("The Application name is " +a.Application_name);
    	 System.out.println("The Application Type is "+a.Application_type);
    	 System.out.println("The Username is "+a.User_name);
    	 System.out.println("The User Gmail is "+a.User_email);

    	 System.out.println( );
    	 
    	 
    	 System.out.println("-------------The Details of Application is -----------------------------");
    	 Application a1=new Application(166151,"Hp5151","Laptop","Kaliya12","Kaliya3205@gmail.com");
    	 System.out.println("The Application Id  is "+a1.Application_id);
    	 System.out.println("The Application name is " +a1.Application_name);
    	 System.out.println("The Application Type is "+a1.Application_type);
    	 System.out.println("The Username is "+a1.User_name);
    	 System.out.println("The User Gmail is "+a1.User_email);
     
     }
}
