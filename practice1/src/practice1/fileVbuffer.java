package practice1;

//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileVbuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		String path="src/practice1/file1.txt";
		
		File file=new File(path);
		
		FileWriter fw=new FileWriter(file,true);
//		BufferedWriter bw=new BufferedWriter(fw);
		
		String	s1=("  we r in file writer...");
		
			fw.write(s1);
			
//			bw.close();
			fw.close();
			
			System.out.println("Done...");
	}

}
