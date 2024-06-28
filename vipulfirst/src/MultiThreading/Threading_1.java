package MultiThreading;
import java.util.*;

class P extends Thread{
	public void run() {
	try {
		for(int i=0;i<=5;i++)
		{
			System.out.println("First Thread is %d\n"+i);
			Thread.sleep(500);
		}
		
	}catch(Exception ex) {
		System.out.println("error is"+ex);
	}
  }
}
class V extends Thread{
	public void run() {
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println("Second Thread is %d\n"+i);
				Thread.sleep(500);
			}
		}catch(Exception ex) {
			System.out.println("Error is"+ex);
		}
	}
}
public class Threading_1 {
	public static void main(String[] args) {
		P a=new P();
		a.start();
		V b=new V();
		b.start();
	}
}
