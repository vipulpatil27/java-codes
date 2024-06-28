//programme of base and  index
package TestJava;

import java.util.*;

public class BaseIndexApplication {

	public static void main(String[] args) {
		{

			int p = 1;
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter the base");
			int base = xyz.nextInt();
			System.out.println("Enter the index");
			int index = xyz.nextInt();
			for (int i = 1; i <= index; i++) {
				p = p * base;
			}
			System.out.printf("Power is %d", p);
		}
	}
}
