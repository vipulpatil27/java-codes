package PracticeProg1;
import java.util.*;
public class Array3rdLargestNo {

	public static void main(String[] args) {
		Scanner xyz=new  Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=xyz.nextInt();
		System.out.println("Enter the values in array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println("\t"+a[i]);
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nThe third largest value is: "+a[2]);
	}
}
