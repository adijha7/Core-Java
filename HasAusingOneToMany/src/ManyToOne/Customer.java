package ManyToOne;



import OnetoManyUserinputAssigment.Course;

public class Customer {
//	id
//	name
//	gender
//	address
//	contact no 
//	 input from ojbect is created order is prepared 
	// when insert welcome customer 
	
//	a method which will display and properties of order
	
	
	
	
	private int id;
	private String name;
	private String gender;
	private String Address;
	private long number;
	
	
	//getter method
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddress() {
		return Address;
	}

	public long getNumber() {
		return number;
	}

	// constructor to initializer 
	public Customer(int id, String name, String gender,
            String address, long number, Order[] order) {
this.id = id;
this.name = name;
this.gender = gender;
this.Address = address;
this.number = number;
this.order = order;
}
	Order[]order;
	
	public void display_data() {
		System.out.println("Customer id :-"+id);
		System.out.println("Customer Name :-"+name);
		System.out.println("Customer Gender :-"+gender);
		System.out.println("Customer Address:-"+Address);
		System.out.println("Customer contact_number:-"+number);
		
		System.out.println("--------------- Course Detail's------------------");
		for(int i=0;i<order.length;i++) {
			System.out.println("Order id :-"+order[i].getId());
			System.out.println("Order Name :-"+order[i].getName());
			System.out.println("Order Price  :-"+order[i].getPrice());
			System.out.println("Order Quantity :-"+order[i].getQuantity());
			System.out.println("----------------------------------------------------------");
	}
	
	
	
	
	

	}
	
}
