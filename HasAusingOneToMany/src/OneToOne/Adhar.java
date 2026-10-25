package hasARelationship;

public class Adhar {
	
	private int adharid;
	private String adharNo;
	
	public Adhar(int id, String adharNo) {
		this.adharid = id;
		this.adharNo = adharNo;
	}
	
	public void setAdhar(int adharid, String adharNo) {
		this.adharid = adharid;
		this.adharNo = adharNo;
	}
	
	public int getadharid() {
		return adharid;
	}
	public String getadharNo() {
		return adharNo;
	}
	public void display() {
		System.out.println("Adhar id : "+adharid);
		System.out.println("Adhar Number : "+adharNo);
	}

}
