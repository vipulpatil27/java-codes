package collectionFrameworks;
import java.util.*;

public class IteratorMethod {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(22);
		v.add(30);
		System.out.println("Data in collection");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}
