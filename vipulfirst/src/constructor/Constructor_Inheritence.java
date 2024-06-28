package constructor;
import java.util.*;

class  Q{
	Q(int x)
	{
		System.out.println("I am parent constructor "+x);
	}
}
class B extends Q{
	B()
	{
		super(100);
		System.out.println("I am child constructor");
	}
}
public class Constructor_Inheritence {

	public static void main(String[] args) {
	B b=new B();	
	}

}
