package ConstructorCreation;

public class Bottle2 {
//	Parameterized Constructor
	
	String brand;
	String colour;
	Double price;
	int capacity;
	
	public Bottle2(String brand, String colour, Double price, int capacity)
	{
		brand=brand;
		
//		brand=a;
//		colour=b;
//		price=c;
//		capacity=d;
//		
	}
public static void main(String[] args) {
	
	Bottle2 b=new Bottle2("Mitton","Black",750.0,1000);
	System.out.println("-----------Bottle Details-------------------");
	System.out.println("The Brand Name is "+b.brand);
	System.out.println("The Colour is "+b.colour);
	System.out.println("The Price is "+b.price);
	System.out.println("The Capacity  is "+b.capacity);
	
}
}
