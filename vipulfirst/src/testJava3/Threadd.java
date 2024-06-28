package testJava3;
import java.util.*;


public class Threadd {

	public static void main(String[] args) {
			Runnable r=()-> {
			for (int i=1;i<=5;i++)
			{
				System.out.print(i+" ");
				try
				{
					Thread.sleep(1000);
				} 
				catch(Exception e) 
				{
					System.out.println("Error : "+e);
				}
			}
		};
		Thread thread = new Thread(r);
		thread.start();
	}
}
