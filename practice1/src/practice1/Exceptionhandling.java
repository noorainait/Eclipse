package practice1;
import java.util.*;

///custom exception...
	class AgeInvalidException extends Exception
	{
		AgeInvalidException(){
			super("Age is invalid !");
		}
		AgeInvalidException(String message){
			super(message);
		}
	}



public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting point....");
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.print("Enter first number: ");
			int n1=sc.nextInt();
			System.out.print("Enter second number: ");
			int n2=sc.nextInt();
		
			
			System.out.println("we have two numbers");
			int result=n1/n2;
			
			System.out.print("Division is  :"+result);
			
			if(n2<10)
			{
				throw new AgeInvalidException("My age is invalid  !!");
			}
			
		}catch(ArithmeticException e) {
			System.out.println("n2 can not be 0 ...");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input ...");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finally Block....");
		
	    }
		System.out.println("Terminated....");
		
		
	}

}
