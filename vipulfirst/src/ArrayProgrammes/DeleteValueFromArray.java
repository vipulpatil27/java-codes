package ArrayProgrammes;
import java.util.*;

public class DeleteValueFromArray {

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
		System.out.println("Enter the index for deletion");
		int index=xyz.nextInt();
		for(int i=index;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("Dispaly the array after deleteion");
		for(int i=0;i<size-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
