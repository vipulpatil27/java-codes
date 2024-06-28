package abstractProg;

import java.util.*;

abstract class Person {
	String name;
	int mob[];
	String adhaar;

	Person(String name, int mob[], String adhaar) {
		this.name = name;
		this.mob = mob;
		this.adhaar = adhaar;
	}

	abstract void display();
}

class Employee extends Person {
	int empid;
	String dept;
	int sal;

	Employee(int empid, String dept, int sal, String name, int mob[], String adhaar) {
		super(name, mob, adhaar);
		// here through super() constructor, Person() constructor called
		this.empid = empid;
		this.dept = dept;
		this.sal = sal;
		this.mob = mob;
	}

	void display() {
		System.out.printf("\n____Person Details____");
		System.out.printf("\nName : %s", name);
		System.out.printf("\nMobile no : ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", mob[i]);
		}
		System.out.printf("\nAdhaar no : %s", adhaar);
		System.out.println("\n\n____Person Details which is now a Employee____");
		System.out.printf("\nEmployee id : %d", empid);
		System.out.printf("\nEmployee department : %s", dept);
		System.out.printf("\nEmployee salary : %d", sal);
	}
}

public class EmployeeInfoApplication {
	public static void main(String[] args) {
		int mob[] = new int[10];
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the person details :");
		System.out.println("name :");
		String name = xyz.next();
		System.out.println("Mobile number");
		for (int i = 0; i < mob.length; i++) {
			mob[i] = xyz.nextInt();
		}
		System.out.println("Aadhaar no :");
		String adhaar = xyz.next();
		// person details are going to merge in employee details
		System.out.println("Enter the employee details :");
		System.out.println("Employee id");
		int empid = xyz.nextInt();
		System.out.println("Employee department");
		String dept = xyz.next();
		System.out.println("Employe salary");
		int sal = xyz.nextInt();
		Employee emp = new Employee(empid, dept, sal, name, mob, adhaar);
		emp.display();
		xyz.close();
	}
}