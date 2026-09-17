package Assignment;

public class middelmaxinarray {
	//for first half 
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		System.out.println("First Half");
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println(max);
	
		
		System.out.println("--------------------------------");
		
		int [] array= {1,2,3,4,5};
		int max1=Integer.MIN_VALUE;
		System.out.println("Second Half");
		for(int i=array.length/2;i<array.length;i++) {
			if(arr[i]>max1) {
				max1=array[i];
			}
			
		}System.out.println(max1);
		
		
		
		
	}

}