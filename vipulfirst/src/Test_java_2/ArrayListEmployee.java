package Test_java_2;
import java.util.*;
import inheritence.SportsPlayerApp;

class Employee{
	private int id;
	private String name;
	private int sal;
	
	Employee(){
		
	}
	
	Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
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
}
public class ArrayListEmployee {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		do {
			xyz=new Scanner(System.in);
			System.out.println("Enter the id,name and salary of employee");
			int id=xyz.nextInt();
			String name=xyz.next();
			int sal=xyz.nextInt();
			al.add(new Employee(id,name,sal));
			System.err.println("Do u want more  employee");
			boolean flag=false;
			String msg=xyz.next();
			if(msg.equals("no"))
			{
				break;
			}
		}while(true);
		System.out.println("Display employee details");
		for(Object obj:al)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		Employee e;
		for(int i=0;i<al.size();i++)
		{
			Object obj=al.get(i);
			for(int j=(i+1);j<al.size();j++)
			{
				Object obj1=al.get(j);
				e=(Employee)obj;
				Employee e1=(Employee)obj1;
				if(e.getSal()<e1.getSal())
				{
					al.set(j, obj);
					al.set(i, obj1);
				}
			}
		}
		System.out.println("Display  after the  sorting");
		for(Object obj:al)
		{
			e=(Employee)obj;
			System.out.println(+e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}
