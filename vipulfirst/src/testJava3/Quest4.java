package testJava3;
import java.util.*;

 import java.lang.*;
public class Quest4 {
	public static void main(String[] args) {
		Runnable r=()->{
			int i;
			for(i=1;i<=5;i++)
			{
					Thread.sleep(1000);
				
			}
	
			System.out.println(" "+i);
		};
	
	}
	Thread t=new Thread(r);
	t.start();
}
