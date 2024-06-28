//prog  of to show 5 employee details with id name and salary

package TestJava;

import java.util.*;

class Employeee { // Employee class
	int id;
	String name;
	int sal;

	Employeee() {

	}

	public Employeee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() { // setter and getter methods
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

public class employeeDetailsApp {

	public static void main(String[] args) { // main method
		ArrayList al = new ArrayList();
		Scanner xyz = new Scanner(System.in);
		do {
			xyz = new Scanner(System.in);
			System.out.println("Enter the ID Name and Salary of Employee");
			int id = xyz.nextInt();
			String name = xyz.next();
			int sal = xyz.nextInt();
			al.add(new Employeee(id, name, sal));
			xyz.nextLine();
			System.out.println("Do u want more employee");
			String msg = xyz.nextLine();
			if (msg.equals("no")) {
				break;
			}
		} while (true);
		System.out.println("Display all the Employee details");
		for (Object obj : al) {
			Employeee emp = (Employeee) obj;
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSal());
		}
	}

}
