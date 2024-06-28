package ArrayProgrammes;
import java.util.*;

public class ArrayEvenNo {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size the of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display the even");
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
