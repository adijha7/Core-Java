package Method_Chaning;

public class Example {
	
	public Example m1() {
		System.out.println("Hello From m1");
		return this;
	}
	
	public Example m2() {
		System.out.println("Hello From m2");
		return this;
	}
	public Example m3() {
		System.out.println("Hello From m3");
		return this;
	}
	
	public static void main(String[] args) {
		
		Example e= new Example();
		e.m1().m2().m3();
	}
	

}
