package OOPsConcept;
import java.util.*;

class A{
	int a=10;
	public void show()
	{
		System.out.println("This is parent method"+a);
	}
}
class B extends A{
	public void show()
	{
		System.out.println("This is child method "+(a+100));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		B b=new B();
		b.show();
	}

}
