package oops.classobj;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student - reference variable TYPE(className)
		// s - reference variable
		// new  - create object
		// Student() --- object
		
		Student s = new Student();
	
		System.out.println("s--reference variable : " + s);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : "); 
		s.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : "); 
		s.name = sc.nextLine();
		System.out.println("Enter Std : "); 
		s.std = sc.nextInt();
		System.out.println("Enter Marks : "); 
		s.marks = sc.nextInt();
		
		System.out.println(s.rno+" " + s.name+" " + s.std+" " + s.marks);
	}
}
