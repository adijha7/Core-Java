package forloop;

import java.util.Scanner;

public class Square {
	
	
	public static void display(int num) {
		
		for(int i=0;i<=num;i++) {
			System.out.println("Square of "+i+" * " +i*i);
			
			
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		display(num);
		
	}

}
