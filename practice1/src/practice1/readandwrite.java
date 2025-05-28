package practice1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class readandwrite {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		File fileInputfile=new File("src/practice1/file1.txt");
		File fileOutputfile=new File("src/practice1/file2.txt");
		
		FileInputStream fis=new FileInputStream(fileInputfile);
		FileOutputStream fos=new FileOutputStream(fileOutputfile);
		
		int c;
		
		while((c=fis.read())!=-1) {
		System.out.print(c);
//			System.out.println((char)c);
			
			fos.write(c);
		}
		fos.close();
		fis.close();
		
		System.out.println("\n done");
	}

}
