package FileHandling;

import java.io.*;
import java.util.*;

public class ReadTheContentApplication {

	public static void main(String[] args) throws Exception{
		Scanner xyz=new Scanner(System.in);
		FileWriter fw=new FileWriter("D:\\aug2022\\firstfile.txt",true);
		System.out.println("Enter the data in file");
		String data=xyz.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("Saved......");
	}

}
