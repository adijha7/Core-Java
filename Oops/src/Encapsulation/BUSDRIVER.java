package Encapsulation;

public class BUSDRIVER {
	public static void main(String[] args) {
		BUS b=new BUS();
		b.setbus(101, "Black", 800 ,"Kallu Singh ", 100);
		System.out.println("Driver_id :- "+b.getid());
		System.out.println("Driver_name :- "+b.getDriver());
		System.out.println("Bus_Colour :-"+b.getcolour());
		System.out.println("Bus_Capacity"+b.getcapacity());
		System.out.println("Bus_speed is :- "+b.getspeed());
	}

}
