package Array1D;

public class ArrayusingNewKeyword {
	public static void main(String[] args) {
//		we are creating array using new keyword
		
		int[]array=new int[5];
		
		// to check what is present in array now
		System.out.println(array);
		
		// To check  what is the length of array
			System.out.println(array.length);
						
		
		// To check  what data present at index 2 
		System.out.println(array[2]);
		
		// To check  what data present at index 4
		System.out.println(array[4]);
				
		// To check  what data present at index 5
//			System.out.println(array[5]);
						
		// To insert the value at index 2
			array[2]=10;
			System.out.println(array[2]);
			
		// To insert the value at index 0
			array[0]=25;
			System.out.println(array[0]);
			
		// To insert the value at 3 index
			array[3]=12;
			System.out.println(array[3]);
			

		// iterate through array
			for(int i=0;i<array.length;i++)
			{
//				System.out.print("["+array[i]+"]");
				System.out.print(array[i]);
			}
			

		
			
			
		
	}

}