package ARRAY;

public class Arraydemo {
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int start=arr[0];
		int end=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			int temp=start;
			start=end;
			end=temp;
			start++;
			end--;
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	

}
