package practice1;

	class overLoad{
		public int add(int a, int b) {
			return a+b;
		}
		public int add(int a,int b,int c) {
			return (a+b+c);			
		}
		public double add(double a,double b) {
			return(a+b);
		}
	}

public class overloading {
    public static void main(String[] args) {
        overLoad o=new overLoad();
      int sum1= o.add(20, 40);
      int sum2= o.add(10, 20, 50);
      double sum3=o.add(20.5, 32.43);
      
      System.out.println(sum1+" "+sum2+" "+sum3);
        
        
    	
    	
    }
}
