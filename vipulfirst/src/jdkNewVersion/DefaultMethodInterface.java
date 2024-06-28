package jdkNewVersion;

interface Interface{
	default void show() {
		System.out.println("I am default method in interface");
	}
}
class B implements Interface{
	
}
public class DefaultMethodInterface {
	public static void main(String[] args) {
		B b=new B();
		b.show();

	}

}
