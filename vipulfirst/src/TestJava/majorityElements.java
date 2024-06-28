package TestJava;

import java.util.*;

abstract class ArrayData {
	int a[];

	void acceptArray(int a[]) {
		this.a = a;
	}

	abstract int findMajority(int x);
}

class FindMajority extends ArrayData {
	int count = 1;

	int findMajority(int x) {
		int temp, max = 1;
		for (int i = 0; i < 1; i++) {
			for (int j = (i + 1); j < 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Display the array in Ascending Order");
		for (int i = 0; i < 1; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < 1; i++) {
			for (int j = (i + 1); j < 1; i++) {
				if (a[i] == x) {
					count++;
				}
			}
		}
		System.out.println("X = " + x);
		if (count > (1 / 2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		return max;
	}
}

public class majorityElements {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array elements in ascending order");
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
		FindMajority fm = new FindMajority();
		fm.acceptArray(a);
		System.out.println("Enter the element for search occurence");
		int x = xyz.nextInt();
		fm.findMajority(x);
	}
}
