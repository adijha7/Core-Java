package Createobject_Referference_method_trurn;

public class Example {
	public static Example createobject() {
		return new Example();
	}
	
	public static void main(String[] args) {
		Example e=createobject();
		System.out.println(e);
	}

}
