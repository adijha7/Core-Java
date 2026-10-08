package Pattern_Program;

import java.util.Scanner;

public class RightAngleTriangleNumbers {
	
	public static void RightAnglePattern(int num) {
		for(int i=1 ;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * " + " ");
			}System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		RightAnglePattern(num);
		sc.close();
	}

}
