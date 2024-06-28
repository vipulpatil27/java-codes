package PracticeProg2;
import java.util.*;
public class arrayError {
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int a[]= int[5];
		System.out.println("Enter the values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display the array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
