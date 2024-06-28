package Interface;

interface X {
	default void show() {
		System.out.println("I am interface method");
	}
}

class B implements X {

}

public class PracticeInterface {

	public static void main(String[] args) {
		B b = new B();
		b.show();

	}

}
