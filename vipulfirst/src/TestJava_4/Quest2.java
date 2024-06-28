package TestJava_4;

class A implements Runnable{
	public void run() {
		try {
			for(int i=1;i<6;i++){
					System.out.println("Good Morning");				
				Thread.sleep(10000);
			}
		}
		catch(Exception ex ) {
			System.out.println(ex);
		}
	}
}
public class Quest2 {
	public static void main(String[] args) {
		A a1=new A();
		Thread t=new Thread(a1);
		t.start();
	}
}