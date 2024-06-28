package TestJava;
import java.util.*;

public class Practiceee {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the size of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Array values are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}