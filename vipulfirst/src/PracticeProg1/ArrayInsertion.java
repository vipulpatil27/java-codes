package PracticeProg1;
import java.util.*;

public class ArrayInsertion {
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
		System.out.println("Display the array values");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d ---> %d\n",i,a[i]);
		}
		System.out.println("Enter the index and value");
		int index=xyz.nextInt();
		int value=xyz.nextInt();
		a[index]=value;
		System.out.println("Display after putting the value");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d ---> %d\n",i,a[i]);
		}
	}
}