package TestJava;

import java.util.*;

public class ArrayRotateApplication {
	private int v[];
	private int k;

	public ArrayRotateApplication(int v[], int k) {
		this.v = v;
		this.k = k;
	}

	public void rotateArray()
	{
		int temp, prev;	
		for (int i = 0; i < k; i++) 
		{
			prev = v[v.length - 1];
			for (int j = 0; j < v.length; j++) 
			{
				temp = v[j];
				v[j] = prev;
				prev = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = xyz.nextInt();
		int v[] = new int[size];
		System.out.println("Enter the values in array");
		for (int i = 0; i < size; i++) {
			v[i] = xyz.nextInt();
		}
		System.out.println("Enter the number to rotate the array");
		int k = xyz.nextInt();
		Rotation r = new Rotation(v, k);
		r.rotateArray();
		System.out.println("The rotated array is: ");
		for (int i : v) {
			System.out.println(i + " ");
		}
	}
}
