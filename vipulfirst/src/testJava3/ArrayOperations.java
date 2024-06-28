package testJava3;
import java.util.*;

interface ArrayInterface{
	void setArray(int a[]);
	void operation();
	
}
class FindMax implements ArrayInterface{

	int a[];
	public void setArray(int[] a) {
			this.a=a;	
	}

	public void operation() {
		Scanner xyz=new Scanner(System.in);
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
		System.out.println("The max element is:"+a[4]);
  }
}
class SortArray implements ArrayInterface{

	int a[];
	public void setArray(int[] a) {
		this.a=a;
	}

	public void operation() {
		Scanner xyz=new Scanner(System.in);
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
		System.out.println("Display the sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}	
}

	
public class ArrayOperations {
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
		FindMax max=new FindMax();
		max.setArray(a);
		max.operation();
		
		SortArray s=new SortArray();
		s.setArray(a);
		s.operation();
	}
}
