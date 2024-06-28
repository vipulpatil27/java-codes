package TestJava;
import java.util.*;

class QW extends Thread{
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
public class ThreadingEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QW a1=new QW();
		a1.start();
	}

}
