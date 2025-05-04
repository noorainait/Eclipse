package practice.question1;
import java.util.*;

		class gross {
			int bs,hra,da,ta,gs;
			
			public gross() {
				System.out.println("Enter the Basic Salary :");
				
				Scanner b=new Scanner(System.in);
				bs=b.nextInt();
				hra=bs/5;
				da=bs/6;
				ta=bs/7;
			}
			public void Salary() {
				gs=hra+da+ta+bs;
				System.out.println("Gross Salary is :"+gs);
			}				
		}

public class constmulticlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gross gs=new gross();
		gs.Salary();
		
	}

}
