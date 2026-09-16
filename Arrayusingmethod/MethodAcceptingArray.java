package Arrayusingmethod;

public class MethodAcceptingArray {
	
	
	public static void accept(int []arr1) {
		for(int i=0;i<arr1.length;i++) 
			
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		accept(arr);
		
	}

}
