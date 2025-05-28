package practice1;

		class shape{
			void drow() {
				
				System.out.println("Drow the shape");
			}			
		}
		
		class circle extends shape{
			void drow() {
				
				System.out.println("Drow a circle");
			}
		}

public class overRiding {

	public static void main(String[] args) {

		shape s=new circle();
			s.drow();
	}

}
