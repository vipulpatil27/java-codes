package TestJava;

import java.io.File;

public class FileHadling {

	public static void main(String[] args)throws Exception {
		File f=new File("D:\\meta.txt");
		boolean b=f.createNewFile();
		if(f.exists())
		{
			System.out.println("path is already present");
		}
		else
		{
			boolean b1=f.mkdir();
		
		if(b)
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("Some problem is there");
		}
	}
	}

}
