package MultiThreading;

class ABC extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.printf("First Thread =%d\t %b\n",i,isAlive());
				if(i==3) {
					stop();
				}
				Thread.sleep(10000);
			}
		}catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
}
class PQR extends Thread {
	public void run() {
		try {
			for(int i=0;i<20;i++)
			{
				System.out.println("Second Thread =");
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("The error is "+ex);
		}
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		ABC a=new ABC();
		a.start();
		PQR p=new PQR();
		p.start();
		
	}

}
