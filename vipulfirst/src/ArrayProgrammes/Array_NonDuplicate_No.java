package ArrayProgrammes;
import java.util.*;

public class Array_NonDuplicate_No {
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
		System.out.println("Display the non duplicate elements");
		boolean dup=false;
		for(int i=0;i<a.length;i++)
		{
			dup=true;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j && a[i]==a[j])
				{
					dup=false;
					break;
				}
			}
			if(dup)
			{
				System.out.println(a[i]+"\t");
			}
		}
	}
}
