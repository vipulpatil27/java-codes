package PracticeProg1;

import java.util.*;

class Employee implements Comparable {

	private int id;

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

	private String name;
	private int sal;

	// @Override the method of comparable interface
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.sal > this.sal) {
			return 1;
		} else if (this.sal < this.sal) {
			return -1;
		} else {
			return 0;
		}
	}

	public class ComparableProgramme {

		public static void main(String[] args) {
			Scanner xyz = new Scanner(System.in);
			ArrayList al = new ArrayList();
			Employee emp[] = new Employee[5];

			for (int i = 0; i < emp.length; i++) {
				emp[i] = new Employee();
				System.out.println("Enter the id,name and salary of employee");
				int id = xyz.nextInt();
				String name = xyz.next();
				int sal = xyz.nextInt();
				emp[i] = new Employee(id, name, sal);
				al.add(emp[i]);
			}
			System.out.println("Display before the sorting");
			for (Object obj : al) {
				Employee e = (Employee) obj;
				System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
			}

			Collections.sort(al);
			System.out.println("Display after the sorting");
			for (Object obj : al) {
				Employee e = (Employee) obj;
				System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());

			}
		}
	}
}
