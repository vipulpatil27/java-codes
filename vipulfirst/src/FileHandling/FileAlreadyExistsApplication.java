package FileHandling;

import java.io.*;

public class FileAlreadyExistsApplication {

	public static void main(String[] args) {
		File f = new File("D:\\aug2022\\node123");
		if (f.exists()) {
			System.out.println("path is already present");
		} else {
			boolean b=f.mkdir();
			if(b){
				System.out.println("Folder created");
			}
			else
			{
				System.out.println("Some prob is there");
			}
		}
	}

}
