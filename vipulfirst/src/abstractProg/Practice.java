package abstractProg;
import java.util.*;

class A{
	void show(){
		System.out.println("I am a CONSTRUCTOR");
	}
}
public class Practice {
	public static void main(String[] args) {
		A a=new A();
		a.show();
	}
}