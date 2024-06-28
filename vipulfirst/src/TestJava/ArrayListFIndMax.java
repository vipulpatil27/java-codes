package TestJava;
import java.util.*;

public class ArrayListFIndMax {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the values in arraylist");
		for(int i=0;i<5;i++)
		{
			int no=xyz.nextInt();
			al.add(no);
		}
		System.out.println("The elements in arrayList arr"+al);
		Object obj=al.get(0);
		int max=(int)obj;
		for(int i=0;i<al.size();i++)
		{
			Object obj1=al.get(i);
			if((int)obj1>max)
			{
				max=(int)obj1;
			}
		}
			System.out.println("Max is"+max);
	}

}
