package Number;

import java.util.Scanner;

public class countdiv5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				count++;
			}
			
			
		}System.out.println(count);
	}

}
