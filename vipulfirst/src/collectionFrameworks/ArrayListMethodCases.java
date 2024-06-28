package collectionFrameworks;

import java.util.*;

public class ArrayListMethodCases {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the values in arraylist");
		for (int i = 0; i < 6; i++) {
			int no = xyz.nextInt();
			al.add(no);
		}
		System.out.println("1: Print all the elements");
		System.out.println("2: Sort all the elements in descending order");
		System.out.println("3: Find the max element");
		System.out.println("4: Find the min element");
		System.out.println("5: Remove element by value");
		System.out.println("6: Remove element by index");
		System.out.println("7: Search the element by value");

		System.out.println("Enter your choice");
		int choice = xyz.nextInt();
		switch (choice) {
		case 1:
			System.out.println("ArrayList elements are: " + al);
			break;
		case 2:
			System.out.println("Elements in descending order are");
			for (int i = 0; i < al.size(); i++) {
				for (int j = (i + 1); j < al.size(); j++) {
					int prev = (int) al.get(i);
					int next = (int) al.get(j);
					if (prev < next) {
						al.set(i, next);
						al.set(j, prev);
					}
				}
			}
			for (Object obj : al) {
				System.out.println(obj);
			}
			break;
		case 3:
			Object obj = al.get(0);
			int max = (int) obj;
			for (int i = 0; i < al.size(); i++) {
				Object obj1 = al.get(i);
				if ((int) obj1 > max) {
					max = (int) obj1;
				}
			}
			System.out.println("The max element is: " + max);
			break;
		case 4:
			obj = al.get(0);
			int min = (int) obj;
			for (int i = 0; i < al.size(); i++) {
				Object obj1 = al.get(i);
				if ((int) obj1 < min) {
					min = (int) obj1;
				}
			}
			System.out.println("The min element is: " + min);
			break;
		case 5:
			System.out.println("Enter the value for removing");
			int val = xyz.nextInt();
			for (int i = 0; i < al.size(); i++) {
				if (al.get(i).equals(val)) {
					al.remove(i);
				}
			}
			System.out.println("After removing the value");
			for (Object obj1 : al) {
				System.out.println(obj1);
			}
			break;
		case 6:
			System.out.println("Enter the index for removing the element");
			int index = xyz.nextInt();
			for (int i = 0; i < al.size(); i++) {
				int prev = (int) al.get(i);
				if (index == prev) {
					al.remove(prev);
				}
			}
			System.out.println("After removing by index");
			for (Object obj3 : al) {
				System.out.println(obj3);
			}
			break;
		case 7:
			System.out.println("Enter the value for searching");
			val = xyz.nextInt();
			boolean flag = false;
			for (int i = 0; i < al.size(); i++) {
				for (int j = (i + 1); j < al.size(); j++) {
					if (al.get(i).equals(val)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Value found");
				} else {
					System.out.println("Value not found");
				}
			}
			break;
		}

	}

}
