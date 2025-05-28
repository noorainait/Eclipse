package practice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			String path="src/practice1/file1.txt";
			
			File file=new File(path);
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
//				int c;
//			while ((c=br.read())!=-1) { //for reading   (-1 for last character)
//				System.out.print((char)c);// only characters n printing in console
//			}
			
//			int c;
//			int CountChar=0;
//			while ((c=br.read())!=-1) {   //reading the character
//				
//				CountChar++;
//			}
//			System.out.print(CountChar);
			
//			int c; 
//			int countLine=0;
//			
//			while((c=br.read())!=-1) {
//				if((char)c=='\n') {
//					countLine++;					
//				}				
//			}
//			countLine++;
//			System.out.print(countLine);
//			System.out.println("\n Done");
			
			int c;
			int countWords=0;
			
			while ((c=br.read())!=-1) {
				if((char)c==' '||(char)c=='\n') {
					countWords++;
				}
			}
			countWords++;
			System.out.print(countWords);
			System.out.println("\n done");
			
	}

}
