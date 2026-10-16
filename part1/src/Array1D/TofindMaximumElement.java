package Array1D;

public class TofindMaximumElement {
	public static void main(String[] args) {
		int []ar= {10,35,89,56,21};
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++) 
		
		{
			if(ar[i]>max) 
			{
				max=ar[i];
				
			}
			
		}
		System.out.println(max);
		}
	}

