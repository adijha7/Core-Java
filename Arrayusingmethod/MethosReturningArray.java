package Arrayusingmethod;

public class MethosReturningArray {
	public static void main(String[] args) {
		
		int []arr1=returnarray();
		System.out.println(arr1);
	
		System.out.println(returnarray());  // Here if print the method address
		
//		to print Element
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
	}
	
	public static int[] returnarray() {
		int [] arr= {10,2,30};
		return arr;
		
	}

}
