package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String f1 = "F://abc/abc.txt";
		
		FileWriter fw = new FileWriter(f1);
		
//		fw.write("Delhi");
//		fw.write("\n is");
//		fw.write('\n');
//		fw.write("capital");
//		fw.write("of");
//		fw.write('\n');
//		fw.write("india");
//		fw.flush();
//		fw.close();
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
//		bw.write("java");
//		bw.write("is");
//		bw.newLine();
//		bw.write("best");
//		bw.write("programming");
//		bw.write(60);
//		bw.flush();
//		bw.close();
		
		PrintWriter pw = new PrintWriter(f1);
		pw.print("java");
		pw.print("is");
		pw.println("in");
		pw.print("competition");
		pw.println("of");
		pw.print(60);
		pw.write(60);
		pw.print("python");
		pw.flush();
		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		String readLine = br.readLine();
		
		pw = new PrintWriter("F://pqr.txt");
		
		while(readLine!=null) {
			
			System.out.println(readLine);
			pw.println(readLine);
			
			
			readLine = br.readLine();
		}
		
		pw.flush();
		pw.close();
		
		
		
		
		
		

	}

}
