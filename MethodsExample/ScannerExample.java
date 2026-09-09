package MethodsExample;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the Boolean");
		boolean b=sc.nextBoolean();
//		System.out.println("Enter the String");
//		String s=sc.next();
		sc.nextLine(); // to push to 
		System.out.println("Enter the String 2 ");
		String s1=sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(s1);
//		System.out.println(s);
		
		
		
		
		sc.close();
	}

}

