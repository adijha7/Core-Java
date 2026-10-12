package TypeofMethod;

public class Variableargument {
	public static void add(int... num) {
		System.out.println(num);
		for(int i=0;i<num.length;i++) {
			 System.out.print(num[i] + " ");
		}
		System.out.println();
		return;
		
	}
	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		
		
	}

}
