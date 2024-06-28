package testJava3;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Employeee implements Serializable{
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
	public void setSal(int sal) {
		this.sal = sal;
	}
}
public class FileHandling {
	public static void main(String[] args)throws Exception {
		Scanner xyz=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("D:\\techub.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Employeee e=new Employeee();
		e.setId(1);
		e.setName("Techhub");
		e.setSal(10000);
		out.writeObject(e);
		out.close();
		fout.close();
		System.out.println("Employee Data Serialized Successfully");
	}
}
