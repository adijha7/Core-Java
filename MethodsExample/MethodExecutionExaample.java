public class MethodExecutionExaample {
	public static void display() {
		System.out.println("Hello From Display");
	}
	public static void test() {
		System.out.println("Hello From");
		display();
		
	}
public static void main(String[] args) {
	System.out.println("----Main Start------");
	display();
	test();
	System.out.println("---- Main End ------ ");
}
}
