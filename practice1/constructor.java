package practice.question1;
import java.util.*;

		class extra{
			public extra() {
				System.out.println("Constructor");
				
			}
			public void show() {
				System.out.println("Enter the Marks of C :");
				Scanner c=new Scanner(System.in);
				int C=c.nextInt();
				
				System.out.println("Enter the marks of java :");
				Scanner j=new Scanner(System.in);
				int java=j.nextInt();
				
				int t=C+java;
				int per=t/2;
				System.out.println("Total :"+t);
				
				System.out.println("Percentage :"+per);
			}
		}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extra e=new extra();
		e.show();
	}

}
