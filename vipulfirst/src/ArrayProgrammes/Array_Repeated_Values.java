package ArrayProgrammes;

import java.util.*;
public class Array_Repeated_Values {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size1=xyz.nextInt();
		int a1[]=new int[size1];
		System.out.println("Enter the values in first array");
		for(int i=0;i<size1;i++)
		{
			a1[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the size of second array");
		int size2=xyz.nextInt();
		int a2[]=new int[size2];
		System.out.println("Enter the values in second array");
		for(int i=0;i<size2;i++)
		{
			a2[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the size of third array");
		int size3=xyz.nextInt();
		int a3[]=new int[size3];
		System.out.println("Enter the values in third array");
		for(int i=0;i<size3;i++)
		{
			a3[i]=xyz.nextInt();
		}
		System.out.println("Display the repeated elements");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				for(int k=0;k<a3.length;k++)
				{
					if(a1[i]==a2[j] && a1[i]==a3[k])
					{
						System.out.println(a1[i]);
						break;
					}
				}
			}
		}
	}

}
