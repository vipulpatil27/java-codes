package stringBufferStringBuilder;

import java.util.*;

public class StringMutableBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Good India");
		System.out.println("Before inserting value: " + sb);
		sb.insert(5,"Morning ");
		System.out.println("\nAfter inserting value: " + sb);

	}

}
