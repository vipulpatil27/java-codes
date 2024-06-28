package PracticeProg2;
import java.util.*;

public class Array_Find_nth_Element {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display the array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nEnter the position to display element");
		int pos=xyz.nextInt();
		int no=a[pos-1];
		System.out.println(no);
		/*int pos=xyz.nextInt();
		int no=a[pos-1];
		System.out.println(no);*/
	}
}
