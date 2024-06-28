package Test_java_2;

class A extends Thread{
	public void run() {
		try {
			for(int i=0;i<100;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				Thread.sleep(100);
			}
		}
		catch(Exception ex ) {
			System.out.println(ex);
		}
	}
}
public class ThreadingEvenNumb {
	public static void main(String[] args) {
		A a1=new A();
		a1.start();
	}
}
