package MultiThreading;

class A extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.printf("First Thread=%d\n", i);
				Thread.sleep(10000);
			}
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
		}
	}
}

class B extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.printf("Second Thread=%d\n", i);
				Thread.sleep(10000);
			}
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		A a = new A();
		a.start();
		B b = new B();
		b.start();
	}

}
