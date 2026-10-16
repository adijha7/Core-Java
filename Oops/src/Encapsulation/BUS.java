package Encapsulation;

public class BUS {
	private int id;
	private String colour;
	private int capacity;
	private  String Driver_name;
	private double speed; 
	
	
	public void setbus(int id,String colour,int capacity,String Driver_name,double speed) {
		this.id=id;
		this.colour=colour;
		this.capacity=capacity;
		this.Driver_name=Driver_name;
		this.speed=speed;
	}
	
	public int getid() {
		return id;		
	}
	
	public String getcolour() {
		return colour ;
	}
	public int getcapacity() {
		return capacity;
		
	}
	public String getDriver() {
		return Driver_name;
		
	}
	public double getspeed() {
		return speed;
	}

}
