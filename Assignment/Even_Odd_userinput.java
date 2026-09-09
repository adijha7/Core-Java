package Assignment;

import java.util.Scanner;

public class Even_Odd_userinput {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the First Number :- ");
		int a1=sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int a2=sc.nextInt();
		sc.close();
		
		for(int i=a1;i<=a2;i++) {
			if(i%2==0) 
			{
				System.out.println(i);
			}
			
		}
		
	}

}