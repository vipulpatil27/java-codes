package PracticeProg1;
import java.util.*;

public class Missing_Elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		int a[] = new int[size + 1];

		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Display Array:");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = (i + 1); j < a.length - 1; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Display Missing Elements of Array:");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = (a[i] + 1); j < a[i + 1]; j++) {
				System.out.println(j);
			}
		}
	}
}