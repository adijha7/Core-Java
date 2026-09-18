package Assignment;

public class Toevenandoddnumberinfromarray {
	
//	To even and odd number from array

	
	public static void main(String[] args) {
		int []arr= {2,4};	
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %2==0) 
				even++;
			
			else 
				odd++;
			
			
		}
		System.out.println("even count"+even);
		System.out.println("Odd Count "+odd);
		
		
		
		
		
			
		}
	
}
