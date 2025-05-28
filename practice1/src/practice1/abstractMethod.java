package practice1;
		
abstract class animal{
		
	abstract void sound();
	
	void eats() {
		System.out.println("This Animal eats food");
	}
	}
 class dog extends animal {
	   void sound() {
		   System.out.println("dog barks");
	   }
   }



public class abstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new dog();
		a.sound();
		a.eats();
	}

}
