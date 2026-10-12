package TypeofMethod;

public class VariableArgforMaxnumber {
	public static void Maxnumber(int... num) {
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			
			}
			
		}
		System.out.print(max);
		System.out.println();
		
	}

	public static void main(String[] args) {
		Maxnumber(10);
		Maxnumber(10,20);
		Maxnumber(10,20,30,40,50,80,20);
	}
}
