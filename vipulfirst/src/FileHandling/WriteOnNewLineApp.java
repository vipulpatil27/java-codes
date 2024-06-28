package FileHandling;

import java.io.*;
import java.util.*;

public class WriteOnNewLineApp {

	public static void main(String[] args) throws Exception {
		Scanner xyz = new Scanner(System.in);
		FileWriter fw = new FileWriter("D:\\aug2022\\firstfile.text", true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter the data");
		String data = xyz.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Saved.....");
	}
}
