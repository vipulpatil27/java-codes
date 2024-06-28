package Interface;
import java.util.*;


interface A {
	void show(); // public abstract void show()
}
public class AnonymousinnerClass {
	public static void main(String[] args) {
		A a = new A() {
			public void show() {
				System.out.println("I am show method");
			}
		};
		a.show();
	}
}
