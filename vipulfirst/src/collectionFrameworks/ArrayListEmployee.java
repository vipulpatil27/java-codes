package collectionFrameworks;
import java.util.*;

class Employee implements Comparator {
	int id;
	String name;
	int sal;

	Employee() {

	}

	public Employee(int id, String name, int sal) {
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
		
		return 0;
	}

}

class SortBySalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		if (emp1.getSal() > emp2.getSal()) {
			return -1;
		} else if (emp1.getSal() < emp2.getSal()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class ArrayListEmployee {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter the number of employee u want");
		int size = xyz.nextInt();
		Employee emp[] = new Employee[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the id,name and salary");
			int id = xyz.nextInt();
			String name = xyz.next();
			int sal = xyz.nextInt();
			emp[i] = new Employee(id, name, sal);
			al.add(emp[i]);
		}
		System.out.println("Employee details before sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
		SortBySalary s = new SortBySalary();
		Collections.sort(al, s);
		System.out.println("Display after sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getSal());
		}
	}

}
