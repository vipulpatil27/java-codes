package FileHandling;
import  java.io.*;
public class MakingFolderApplication {

	public static void main(String[] args) {
		File f=new File("D:\\aug2022");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("Folder created successfully....");
		}
		else
		{
			System.out.println("Folder not created");
		}
	}
}