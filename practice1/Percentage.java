package practice.question1;
import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int C,java,html,css,t,per;
			
			System.out.println("Enter the marks of C :");
			Scanner c=new Scanner(System.in);
			C=c.nextInt();
			
			System.out.println("Enter the marks of Java :");
			Scanner J=new Scanner(System.in);
			java=J.nextInt();
			
			System.out.println("Enter the marks of HTML :");
			Scanner h=new Scanner(System.in);
			html=h.nextInt();

			System.out.println("Enter the marks of CSS :");
			Scanner cs=new Scanner(System.in);
			css=cs.nextInt();
			
			t=C+java+html+css;
			System.out.println("Total :"+t);
			
			per=t/4;
			System.out.println("Percentage :"+per);
			
	}

}
