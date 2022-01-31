package JavaPack;

import java.util.Scanner;

class Employee{	
	String name,ph_no,address;
	int age,sal;


void GetInfo()
{Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter name: ");
 name=sc.next();
 System.out.println("Enter age: ");
 age=sc.nextInt();
 System.out.println("Enter address: ");
 address=sc.next();
 System.out.println("Enter phone number: ");
 ph_no=sc.next();
 System.out.println("Enter salary: ");
 sal=sc.nextInt();
}

void PrintInfo() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Address: "+address);
	System.out.println("Phone Number: "+ph_no);
	System.out.println("Salary: "+sal);

}
}

class Officer extends Employee{
	String specialization;
	 
	 void GetInfo(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter specialization of officer: ");
		 specialization = sc.nextLine();
		 
		 super.GetInfo();
	 }

	 void PrintInfo() {
		 super.PrintInfo();
		 System.out.println("Specialization: "+specialization);
	 }
}

class Manager extends Employee{
	String dept;
	 
	 void GetInfo(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter department of manager: ");
		 dept = sc.nextLine();
		 
		 super.GetInfo();
	 }

	 void PrintInfo() {
		 super.PrintInfo();
		 System.out.println("Department: "+dept);
	 }
}

public class javapack_inheritance_1 {

	public static void main(String[] args) {
      
		Officer o1 = new Officer();
		Manager m1 = new Manager();
		
		System.out.println("Enter information of Officer: ");
		o1.GetInfo();
		System.out.println("Enter information of Manager: ");
		m1.GetInfo();
		System.out.println("Information of Officer: ");
		o1.PrintInfo();
		System.out.println("Information of Manager: ");
		m1.PrintInfo();

	}
}
