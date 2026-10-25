package hasARelationship;

public class Person {
	
	private int id;
	private String name;
	private String gender;
	private String date;
	
	public Person(int id, String name, String gender, String date) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
	}
	
	public void setPerson(int id, String name, String gender, String date) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
	
	}
	
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public String getdate() {
		return date;
	}
	public void display() {
		System.out.println("Person's id : "+id);
		System.out.println("Person's name : "+name);
		System.out.println("Person's gender : "+gender);
		System.out.println("Person's DOB : "+date);
		
	}
	Adhar a = new Adhar(id, date);

}
