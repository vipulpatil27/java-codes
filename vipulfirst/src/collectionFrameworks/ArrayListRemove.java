package collectionFrameworks;

import java.util.*;

public class ArrayListRemove {
	public static void main(String[] args) {

		Vector v = new Vector();
	
			Scanner xyz = new Scanner(System.in);
			System.out.println("case 1: Add the new element in vector");
			System.out.println("case 2: To know the size of vector");
			System.out.println("case 3: Element searching in vector");
			System.out.println("case 4: Remove the element from vector");
			System.out.println("case 5: Count the number of element prresent in Vecto");
			System.out.println("case 6: Update or replace element on specified index in Vector");
			System.out.println("case 7: Insert the element on specified position in Vector");

			System.out.println("Enter the choice");

			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the values in collections");
				int value = xyz.nextInt();
				v.add(value);
				break;
			case 2:
				for (int i = 0; i < v.size(); i++) {
					System.out.println(v.get(i));
				}
				break;
			case 3:
				System.out.println("Enter the element for searching in collection");
				value = xyz.nextInt();
				boolean b = v.contains(value);
				if (b) {
					System.out.println("Element Found" + value);
				} else {
					System.out.println("Element not found");
				}
				break;
			case 4:
				System.out.println("Enter the element for remove");
				value = xyz.nextInt();
				int index = xyz.nextInt();
				if (index != -1) {
					v.remove(index);
				} else {
					System.out.println("Element not present in collection for remove");
				}
				break;
			case 5:
				System.out.println("Number of element in vector" + v.size());
				break;
			case 6:
				System.out.println("Enter the index for replacement");
				index = v.size();
				if (index <= v.size() - 1) {
					System.out.println("Enter the value for replacement");
					value = xyz.nextInt();
					v.set(index, value);
				} else {
					System.out.println("Index is not present");
				}
				break;
			case 7:
				System.out.println("Enter the index for replacement");
				index = v.size();
				if (index <= (v.size() - 1)) {
					System.out.println("Enter the value for replacement");
					value = xyz.nextInt();
					v.insertElementAt(value, index);
				} else {
					System.out.println("Index  not present");
				}
				break;
			case 8:
				System.exit(0);
				break;
			}
		} 
	}
