package ManyToOne;

public class Order {
//	id order
//	order name
//	order price
	//Quantity
	
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public Order(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	

}
