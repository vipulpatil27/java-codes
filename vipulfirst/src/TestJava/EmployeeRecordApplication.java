package TestJava;

import java.util.*;

class Employee {
	int id;
	String name;
	int sal;

	public int getId() {
		return id;
	}

	Employee() {

	}

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

public class EmployeeRecordApplication {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner xyz = new Scanner(System.in);
		do {
			xyz = new Scanner(System.in);
			System.out.println("Enter the ID Name and Salary of Employee");
			int id = xyz.nextInt();
			String name = xyz.next();
			int sal = xyz.nextInt();
			al.add(new Employee(id, name, sal));
			xyz.nextLine();
			System.out.println("Do u want more employee");
			String msg = xyz.nextLine();
			if (msg.equals("no")) {
				break;
			}
		} while (true);
		System.out.println("Display all the Employee details");
		for (Object obj : al) {
			Employee emp = (Employee) obj;
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSal());
		}
		System.out.println("Enter the id for search"); 
		int empId = xyz.nextInt();
		boolean flag = false;
		for (Object obj : al) {
			Employee emp = (Employee) obj;
			if (emp.getId() == empId) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Employee found");
		} else {
			System.out.println("Employee not found");
		}
	}
}
