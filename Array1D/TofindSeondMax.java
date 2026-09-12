package Array1D;

public class TofindSeondMax {
public static void main(String[] args) {
	int [] arr= {10,35,89,56,21};
	int max1=arr[0]; //10
	int max2=arr[0];//10
	
//	int max1=Integer.MIN_VALUE;
	
	for( int i=0;i<arr.length;i++) 
	{
		
		if(arr[i]>max1) {
			max2=max1;
			max1=arr[i];
		}
		else if(arr[i]>max2 && arr[i]!=max1) {
			max2=arr[i];
		}
	}
	System.out.println(max1);
	System.out.println(max2);
	





}


}