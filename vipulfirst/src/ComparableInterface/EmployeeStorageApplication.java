package ComparableInterface;

import java.util.*;

class Employee implements Comparable {

	private int id;
	private String name;
	private int sal;

	Employee() {

	}

	Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
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

	// @Override the method of comparable
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.id > e.id) {
			return 1;
		} else if (this.id < e.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class EmployeeStorageApplication {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		Employee emp[] = new Employee[5]; // array of objects
		
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			System.out.println("Enter the ID,Name and Salary of Employee");
			int id = xyz.nextInt();
			xyz.nextLine();
			String name = xyz.next();
			int sal = xyz.nextInt();
			emp[i] = new Employee(id, name, sal); // array of objects
			al.add(emp[i]);
		}
		
		System.out.println("Employee records before sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
		
		Collections.sort(al);      
		System.out.println("Employee Records After sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
	}
}
