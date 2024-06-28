package TestJava;

import java.util.*;
import java.io.*;
public class WriteDataInFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		FileWriter fw=new FileWriter("D:\\data.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the data");
		String data=xyz.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Saved.....");
	}

}
