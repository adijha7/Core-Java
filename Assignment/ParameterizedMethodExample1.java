package Assignment;



public class ParameterizedMethodExample1 
{
	static void multi(int a,int b,int c) {
		int mul =a*b*c;
		System.out.println("The Multiplication is "+ a+ " "+ b+" " +" "+ c+ " : " +mul );
	}
	public static void main(String[] args) {
		multi(2,3,2);
	}
	}
