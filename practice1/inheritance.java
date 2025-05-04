package practice.question1;

	class person{
			String name;
			int age;
			
			public void display() {
				name="Ayaan";
				age=21;
				
				System.out.print("Name :"+name+" "+"Age :"+age);
				
			}
			
	}
	class Student extends person{
		String  colName;
		
		
		public void studDetails() {
			colName="MIT Collage";
			
			System.out.print("Collage :"+colName);
		}
	}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s=new Student();
			s.display();
			s.studDetails();
			
	}

}
