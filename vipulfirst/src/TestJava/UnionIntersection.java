package TestJava;

import java.util.*;

abstract class ArrayValue {
	protected int a[];
	protected int b[];

	void acceptArray(int a[], int b[]) {
		this.a = a;
		this.b = b;
	}

	abstract void findUnion();

	abstract void findIntersection();
}

class ArrayIntersection extends ArrayValue {
	private int count = 0;
	private int c[] = new int[5];

	void findIntersection() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[i] = a[i];
				}
			}
		}
	}

	public void show() {
		System.out.println("Intersection array is: ");
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				System.out.printf("%d\t", c[i]);
			}
		}
	}

	void findUnion() {

	}
}

class ArrayUnion extends ArrayValue {
	private int d[] = new int[5];

	void findIntersection() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[j]) {
					d[i] = b[i];
				}
			}
		}
	}

	public void display() {
		System.out.println("Union array is:");
		for (int i = 0; i < d.length; i++) {
			System.out.printf("%d\t", d[i]);
		}
	}

	void findUnion() {

	}
}

public class UnionIntersection {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("1)Array Intersection\n2)Array Union\nEnter your choice");
		int choice = xyz.nextInt();
		switch (choice) {
		case 1:
			ArrayIntersection ai = new ArrayIntersection();
			System.out.println("Enter the size of first array");
			int size = xyz.nextInt();
			int a[] = new int[size];
			System.out.println("Enter the size of second array");
			int size1 = xyz.nextInt();
			int b[] = new int[size1];
			System.out.println("Enter the values in first array");
			for (int i = 0; i < a.length; i++) {
				a[i] = xyz.nextInt();
			}
			System.out.println("Enter the values in second array");
			for (int i = 0; i < b.length; i++) {
				b[i] = xyz.nextInt();
			}
			ai.acceptArray(a, b);
			ai.findIntersection();
			break;
		case 2:
			break;
		}
	}

}
