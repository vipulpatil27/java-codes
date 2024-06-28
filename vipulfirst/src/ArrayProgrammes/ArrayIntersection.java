package ArrayProgrammes;

import java.util.*;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size1 = xyz.nextInt();
		int a1[] = new int[size1];
		System.out.println("Enter the values in array");
		for (int i = 0; i < a1.length; i++)
		{
			a1[i] = xyz.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int size2 = xyz.nextInt();
		int a2[] = new int[size2];
		System.out.println("Enter the values in 2nd array");
		for (int i = 0; i < a2.length; i++) 
		{
			a2[i] = xyz.nextInt();
		}
		int size3 = xyz.nextInt();
		int c[] = new int[size3];
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a2.length; j++)
			{
				if (a1[i] == a2[j])
				{
					c[i] = a1[i];
				}
			}
		}
		System.out.println("Dispaly the intersected array");
		for (int i = 0; i <c.length; i++) {
			if (c[i] != 0)

				System.out.printf("%d\t", c[i]);
		}
	}

}
