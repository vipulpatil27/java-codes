package ComparatorInterface;

import java.util.*;

// import java.util.Comparator;
class Employee implements Comparator {

	private int id;
	private String name;
	private int sal;

	public Employee() {

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

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class SortEmployeeBySal implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		if (emp1.getSal() > emp2.getSal()) {
			return 1;
		} else if (emp1.getSal() < emp2.getSal()) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class EmployeeStorage {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		Employee emp[] = new Employee[4];
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter the id,name,sal of employee");
			int id = xyz.nextInt();
			String name = xyz.next();
			int sal = xyz.nextInt();
			emp[i] = new Employee(id, name, sal); // array of objects
			al.add(emp[i]);
		}
		SortEmployeeBySal s = new SortEmployeeBySal();
		Collections.sort(al, s);
		System.out.println("Employee records After sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
	}
}
