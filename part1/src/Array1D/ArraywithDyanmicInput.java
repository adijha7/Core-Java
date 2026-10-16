package Array1D;

import java.util.Scanner;

public class ArraywithDyanmicInput {
	public static void main(String[] args) {
		long[]arr=new long[3];

		Scanner s=new Scanner(System.in);
		
		for (int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter the Number");
		    arr[i]=s.nextLong();

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		s.close();
	}

}
