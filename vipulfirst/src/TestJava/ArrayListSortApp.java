package TestJava;
import java.util.*;
public class ArrayListSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the size of array list");
		int size=xyz.nextInt();
		System.out.println("Enter the values in array list");
		for(int i=0;i<size;i++)
		{
			int value=xyz.nextInt();
			al.add(value);
		}
		Collections.sort(al);
		System.out.println("ArrayList  values in ascending order is");
		for(Object obj:al) {
			System.out.println(obj);
		}
	}

}
