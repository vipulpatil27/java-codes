package TestJava;

import java.util.*;

class MaxArray {
	int a[];

	MaxArray(int a[]) {
		this.a = a;
	}

	void performMax() {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The maximum value is " + max);
	}

	public class MaxArrayApp {

		public static void main(String[] args) {
			int i, j, n;
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter the size of array");
			n = xyz.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the values in array");
			for (i = 0; i < a.length - 1; i++) {
				a[i] = xyz.nextInt();
			}
			MaxArray m = new MaxArray(a);
			m.performMax();
		}

	}
}
