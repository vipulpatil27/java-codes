package collectionFrameworks;
import java.util.*;

public class Ennumeration {

	public static void main(String[] args) {
		System.out.println("The value in vector are: ");
		Vector v=new Vector();
		v.add(20);
		v.add(45);
		v.add(22);
		v.add(65);
		Enumeration enm=v.elements();
		while(enm.hasMoreElements())
		{
			Object obj=enm.nextElement();
			System.out.println(obj);
		}
	}
}
