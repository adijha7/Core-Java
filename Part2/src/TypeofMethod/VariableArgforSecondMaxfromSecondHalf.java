package TypeofMethod;

public class VariableArgforSecondMaxfromSecondHalf {
	
	public static void display(int... num) {
		int max1=0;
		int max2=0;
		for(int i=num.length/2 ;i<num.length;i++) {
			if(num[i]>max1) {
				max2=max1;
				max1=num[i];
				}
			if( num[i]>max2 && num[i]!=max1) {
				max2=num[i];
				//System.out.print(max2);
			}
		
			System.out.print(max2);	
		}
	}
	public static void main(String[] args) {
		display(10,20,30,40,50);
	}

}
