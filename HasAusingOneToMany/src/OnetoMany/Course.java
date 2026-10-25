package OnetoMany;

public class Course {
	
	private int id;
	private String name ;
	private int fees;
	private int duration;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getFees() {
		return fees;
	}
	public int getDuration() {
		return duration;
	}
	public Course(int id, String name, int fees, int duration) {
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.duration = duration;
	}
	
}
