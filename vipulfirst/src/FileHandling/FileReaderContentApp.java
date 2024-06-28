package FileHandling;

// this program read the content by single single character.

import java.io.*;
import java.util.*;

public class FileReaderContentApp {

	public static void main(String[] args) throws Exception {
		Scanner xyz = new Scanner(System.in);
		FileReader fr=new FileReader("D:\\aug2022\\firstfile.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			System.out.println(ch);
		}
	}
}
