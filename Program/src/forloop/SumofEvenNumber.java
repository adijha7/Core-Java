package forloop;

import java.util.Scanner;

public class SumofEvenNumber {
	public static void display( int num) {
		int sum=0;
		for(int i=1;i<=num;i++) 
		{
		if(i%2==0) {
			sum=sum+i;
		}
		}
		System.out.println("The Sum of Even Number is "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num=sc.nextInt();
		display(num);
	}

}
