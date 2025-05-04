package practice.question1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		int a,f=1;
		
		System.out.print("Enter the value");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();	
		
		for(int k=1;k<=a;k++) {
			f=f*k;
		}
		System.out.println("Factorial :"+f);
		}

}
