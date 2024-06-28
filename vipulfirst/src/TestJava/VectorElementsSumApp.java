package TestJava;

import java.util.*;

public class VectorElementsSumApp {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter the size of vector");
		int size = xyz.nextInt();
		System.out.println("Enter the values in vector");
		for (int i = 0; i < size; i++) {
			int value = xyz.nextInt();
			v.add(value);
		}
		int sum = 0;

		for (Object obj : v) {
			sum = sum + (int) obj;
		}
		System.out.println("The sum of all vector elements is: " + sum);
	}

}
