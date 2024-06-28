package FileHandling;
import java.io.*;

public class FileHandling1 {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}

}
