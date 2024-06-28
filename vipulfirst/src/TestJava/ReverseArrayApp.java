// Reverse array prog 
package TestJava;

import java.util.*;

class ReverseArray {           //class ReverseArray
	int a[];

	ReverseArray(int a[]) {
		this.a = a;
	}
	void performReverse() {
		int mid = a.length / 2;
		int end = a.length - 1;
		int start;
		for (start = 0; start < mid; start++) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			end--;
		}

	}

	void Afterdisplay() {
		System.out.println("Display the reverse array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

public class ReverseArrayApp {

	public static void main(String[] args) {               //main class
		int i, j, n;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = xyz.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the valus in array");
		for (i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
		ReverseArray r=new ReverseArray(a);
		r.performReverse();
		r.Afterdisplay();
	}

}
