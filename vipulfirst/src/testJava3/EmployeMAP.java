package testJava3;

import java.util.LinkedHashMap;
import java.util.Scanner;

class Employee {

	private int id;
	private String name;
	private int sal;

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

	public void setMarks( int sal) {
		this.sal = sal;
	}

}
public class EmployeMAP {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> map = new LinkedHashMap<Integer,Employee>();
		Scanner sc = new Scanner(System.in);
		int id, sal;
		String name;
		System.out.println("Enter employee details\n");
		for (int i=1;i<=5;i++) 
		{
			Employee employee = new Employee();
			System.out.print("\nID : ");
			id = sc.nextInt();
			employee.setId(id);
			sc.nextLine();
			System.out.print("NAME : ");
			name = sc.nextLine();
			employee.setName(name);
			System.out.print("Salary : ");
			sal = sc.nextInt();
			employee.setMarks(sal);
			map.put(employee.getId(), employee);
		}

		int num=0;
		do {
		System.out.println("\nSearch Employee:");
		System.out.println("1. By ID");
		System.out.println("2. By salary");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
			case 1:
				System.out.print("\nEnter employee ID: ");
				id = sc.nextInt();
				Employee empId = map.get(id);
				
				if (empId != null)
				{
					System.out.println("\nEmployee found:");
					System.out.println("Id: " + empId.getId());
					System.out.println("Name: " + empId.getName());
					System.out.println("Salary: " + empId.getSal());
				}
				else
				{
					System.out.println("\nEmployee not found");
				}
				break;
			case 2:
				System.out.print("\nEnter employee salary: ");
				sal = sc.nextInt();
				boolean flag = false;
				for (Employee employee:map.values()) 
				{
					if (employee.getSal()==sal)
					{
						System.out.println("\nEmployee found:");
						System.out.println("Id: " + employee.getId());
						System.out.println("Name: " + employee.getName());
						System.out.println("Salary: " + employee.getSal());
						flag = true;
						break;
					}
				}
				if (!flag)
				{
					System.out.println("\nEmployee is found");
				}
				break;
				
			default:
				System.out.println("\nWrong choice.");
				break;
		}
		System.out.print("\nContinue or Exit(1/0) : ");
		num = sc.nextInt();
		}while(num!=0);
		sc.close();
	}
}
