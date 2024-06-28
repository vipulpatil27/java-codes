package ArrayProgrammes;
import java.util.*;

public class MaxRepeatativeElement {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
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
		System.out.println("Display after the sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int count=1;
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=(i+1);j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					i++;
				}
			}
			System.out.printf("\n%d ---> %d",a[i],count);
		}
	}
}