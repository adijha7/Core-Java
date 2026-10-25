package ARRAY;

public class To_ArrayReveser {
	
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int start=arr[0];
		
		
		
		
		for(int i=arr.length-1;i>=0;i--) {
			if(i>start) {
			
				start=i;
				
			}
			System.out.println(arr[i]);
		}
	
	}

}
