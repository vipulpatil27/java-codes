package TestJava;
import java.util.*;

class Square implements Cloneable{
	int no,s;
	void setValue(int a)
	{
		no=a;
	}
	void CalSquare()
	{
		s=no*no;
		System.out.println("Square is :"+s);
	}
}
public class ObjectCloning {

	public static void main(String[] args) {
		System.out.println("With object s1");
	    Square s1=new Square();
	    s1.setValue(10);
	    s1.CalSquare();
	    System.out.println("with object s2");
	    Square s2=new Square();
	    s2=s1;
	    s2.setValue(2);
	    s2.CalSquare();
	}

}
