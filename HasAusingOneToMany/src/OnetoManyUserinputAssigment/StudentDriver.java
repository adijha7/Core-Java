package OnetoManyUserinputAssigment;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The id :- ");
		int a=sc.nextInt();
		System.out.println("Enter The Name :- ");
		String b=sc.next();
		System.out.println("Enter The Gender :- ");
		String c=sc.next();
		System.out.println("Enter The Age :- ");
		int d=sc.nextInt();
		
		
		Student s= new Student(a,b,c,d);
		s.display();
	}

}
