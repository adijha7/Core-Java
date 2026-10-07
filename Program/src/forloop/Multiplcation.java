package forloop;

import java.util.Scanner;

public class Multiplcation {
	
	
	public static void table(int num) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(num +" * "+i+" = "+ num*i);
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Multiplication of "+num);
		table(num);
		
		sc.close();
		
	}

}
