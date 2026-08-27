package operatorsexceution;

public class ConditionalOperatorExecution {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		boolean result= a>b?true:false;
		System.out.println(result);
		
		String res=a>b?"10 is Greater then 20 ": "10 is Not Greater then 20";
		System.out.println(res);
		
	}
	

}
