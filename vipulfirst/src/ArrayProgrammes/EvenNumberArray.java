package ArrayProgrammes;
import java.util.*;

public class EvenNumberArray {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=xyz.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("The even numbers are: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}
