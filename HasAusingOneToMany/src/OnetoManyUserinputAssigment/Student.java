package OnetoManyUserinputAssigment;

import java.util.Scanner;

public class Student {
	private int id;
	private String name ;
	private String gender ;
	private int age ;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public Student(int id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	Course[]course= 
		{
				new Course(101,"Java",60000,1),
				new Course(102,"Manual Testing ",30000,6 ),
				new Course(103,"SQL",10000,3)
		};
	
	
	public void display() {
		
		System.out.println("Student id :-"+id);
		System.out.println("Student Name :-"+name);
		System.out.println("Student Gender :-"+gender);
		System.out.println("Student age:-"+age);
		System.out.println("--------------- Course Detail's------------------");
		for(int i=0;i<course.length;i++) {
			System.out.println("Course id :-"+course[i].getId());
			System.out.println("Course Name :-"+course[i].getName());
			System.out.println("Course Fees :-"+course[i].getFees());
			System.out.println("Course Duration:-"+course[i].getDuration());
			System.out.println("----------------------------------------------------------");
		}
	}
	
	
	

}
