package ArrayAssigment;

public class ToRotateFirstArrayElement {
//	 To To Rotate First Array Element by 1
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50,80,70};

		int temp = arr[0];
		

		for(int i = 0; i < arr.length; i++) {
			
		   arr[i]=arr[i]+i;
		}
		System.out.println(temp);
		//arr.length-1 =temp;
		}
	}


