package ConstructorCreation;

public class Bottle {
//	Parameterized Constructor
	
	String brand;
	String colour;
	Double price;
	int capacity;
	
	public Bottle(String a,String b,Double c,int d){
		brand=a;
		colour=b;
		price=c;
		capacity=d;
		
	}
public static void main(String[] args) {
	
	Bottle b=new Bottle("Mitton","Black",750.0,1000);
	System.out.println("-----------Bottle Details-------------------");
	System.out.println("The Brand Name is "+b.brand);
	System.out.println("The Colour is "+b.colour);
	System.out.println("The Price is "+b.price);
	System.out.println("The Capacity  is "+b.capacity);
	
}
}
