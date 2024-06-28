package FileHandling;

import java.io.*;

public class WriteContentIntoAnotherFile {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("D:\\aug2022\\firstfile.text");
		BufferedReader br=new BufferedReader(fr);
		String data;
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}	
	}
}