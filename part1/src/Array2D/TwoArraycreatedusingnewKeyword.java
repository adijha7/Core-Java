package Array2D;

public class TwoArraycreatedusingnewKeyword {
	public static void main(String[] args) {
		// to Create an array
		int [][] arr=new int[3][3];
		System.out.println(arr);   // it Will give Address 
		
//		To check the length of array
		System.out.println(arr.length);   // 3
		
//		Element present at 0th index
		System.out.println(arr[0]); 
		
//		length of row in index 1
		System.out.println(arr[1].length);
		
//		element present at row index 2 and column index 2
		System.out.println(arr[2][2]);
		
//		element present at row index 3 and column index 0
		System.out.println(arr[3][0]);
		
	}  

}
