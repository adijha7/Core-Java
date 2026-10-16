package Assigment;

public class Application {
	private int application_id;
	private String application_name;
	private String applcication_type;
	private int application_size;
	
	private Application(int application_id,String application_name,String applcication_type,int application_size) {
		this.application_id=application_id;
		this.application_name=application_name;
		this.applcication_type=applcication_type;
		this.application_size=application_size;
	}
		
	public void setapp(int application_id,String application_name,String applcication_type,int application_size) {
		this.application_id=application_id;
		this.application_name=application_name;
		this.applcication_type=applcication_type;
		this.application_size=application_size;
	}
	
	public int getid() {
		return application_id;
		
	}
	
	public  String getname() {
		return application_name;
		
	}
	
	public String gettype() {
		return applcication_type;
	}

	public int getsize() {
		return application_size;
	}
	
	public void display() {
		System.out.println("Application id :-"+application_id);
		System.out.println("Application name :-"+application_name);
		System.out.println("Application type :-"+applcication_type);
		System.out.println("Applcation_size :-"+application_size);
		
	}
	
	public static Application object(int application_id,
	        String application_name, String applcication_type,
	        int application_size) {

	    return new Application(application_id, application_name,
	            applcication_type, application_size);
	}
	
}
