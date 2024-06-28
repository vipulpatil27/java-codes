package ArrayProgrammes;

import java.util.*;

public class MissingNumbersOfArray {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		System.out.println("Enter the values in array");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display the array");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The missing elements are");
		{
			for(int i=0;i<size-1;i++)
			{
				for(int j=a[i]+1;j<a[i+1];j++)
				{
					System.out.println(j);
				}
			}
		}
	}
}