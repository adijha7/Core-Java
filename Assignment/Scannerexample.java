package Assignment;

import java.util.Scanner;

public class Scannerexample {
	
	public  static int check(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The First Number");
		int user1=sc.nextInt();
		System.out.println("Enter The Second Number");
		int user2=sc.nextInt();
		
//		
		System.out.println(check(user1,user2));
	}

}