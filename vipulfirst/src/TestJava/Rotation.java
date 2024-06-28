package TestJava;

import java.util.*;

public class Rotation {

	private int[] array;
	private int k;

	public Rotation(int[] array, int k) {
		this.array = array;
		this.k = k;
	}

	public void rotateArray()
	{
		int temp, previous;
		for (int i = 0; i < k; i++) 
		{
			previous = array[array.length - 1];
			for (int j = 0; j < array.length; j++) 
			{
				temp = array[j];
				array[j] = previous;
				previous = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the element in the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter the number for rotate the array: ");
		int k = sc.nextInt();
		Rotation r = new Rotation(array, k);
		r.rotateArray();
		System.out.println("The rotated array is: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
