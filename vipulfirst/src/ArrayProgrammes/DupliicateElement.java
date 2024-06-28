package ArrayProgrammes;
import java.util.*;

public class DupliicateElement {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in array");
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
		System.out.println("Duplicate elements are");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println(a[i]);
			}
		}
	}
}
