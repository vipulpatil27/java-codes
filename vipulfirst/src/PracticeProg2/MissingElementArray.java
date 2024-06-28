//Array missing elements using class and objects
package PracticeProg2;
import java.util.*;

class ArrayMissingApp{
	int a[];
	public void setArray(int a[]) {
		this.a=a;
	}
	public void findMissing() {
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
		System.out.println("The missing elements are: ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(j);
			}
		}
	}
}
public class MissingElementArray {
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
		ArrayMissingApp am=new ArrayMissingApp();
		am.setArray(a);
		am.findMissing();
	}
}
