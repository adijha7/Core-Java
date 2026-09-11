package Array1D;

public class ArrayWithoutNewKeyword {
	public static void main(String[] args) {
		
		int []arr= {10,20,30,40,50};
		
		System.out.println(arr);
		
		// To Check the length of array
		System.out.println(arr.length);
		
		
		// To check the element at 3 index
		System.out.println(arr[3]);
		
		// To check the element at 5 index
//		System.out.println(arr[5]);  // Through the Exception 
				
		
		// to Do iterator
		System.out.print("[");
	 for(int i=0;i<arr.length;i++) 
	 {
		System.out.print(arr[i] + " ");
	 }
		System.out.print("]");
	}
	
	

}