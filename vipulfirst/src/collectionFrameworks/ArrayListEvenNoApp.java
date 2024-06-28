package collectionFrameworks;
import java.util.*;

public class ArrayListEvenNoApp {

	public static void main(String[] args) {
		Scanner  xyz=new Scanner(System.in);
	ArrayList al =new ArrayList();
		System.out.println("Enter the values in arrray");
		for(int i=1;i<=5;i++)
		{
			int no=xyz.nextInt();
			al.add(no);
		}
	
		System.out.println("Even Numbers Are :- ");
		for(int i=0;i<al.size();i++)
		{
			Object obj1=al.get(i);
			
			if( (int)obj1 % 2 == 0)
			{
				System.out.printf("%d\n",obj1);
			}
		}
	}

}
