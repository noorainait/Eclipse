package practice1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="src/practice1/file1.txt";
		
		File file=new File(path);
		
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text ....");
		
		String s1=sc.nextLine();
		
		bw.write(s1);
		System.out.println("Done");
		
		bw.close();
		fw.close();
		
	
//			String path="src/practice1/file1.txt";
//		
//			File file=new File(path);
//			
//			FileWriter fw =new FileWriter(file);
//			BufferedWriter bw=new BufferedWriter(fw);
//			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter the text ...");
//		String s1=sc.nextLine();
//		
//		bw.write(s1);
//			
////			bw.write("Hello there");
//			System.out.println("Done.");
//			
//			bw.close();
//			fw.close();
//			
//			
//			
			
	}

}
