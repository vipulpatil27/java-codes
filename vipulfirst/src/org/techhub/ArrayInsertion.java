package org.techhub;
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
		System.out.println("Array before the operation");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d ---> %d\n",i,a[i]);
		}
		System.out.println("Enter the index and value");
		int index=xyz.nextInt();
		int value=xyz.nextInt();
		a[index]=value;
		System.out.println("Array after the operation");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d ---> %d\n",i,a[i]);
		}
	}
}