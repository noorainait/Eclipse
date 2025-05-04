package practice.question1;
		 
		class encapsul{
			private int id;
			private String name;
			private String lastname;
			
			public int getid() {
				return id;
			}
			public String getName() {
				return name;
			}
			public String getLastname() {
				return lastname;
			}
			
			public void setid(int newid) {
				id=newid;
			}
			public void setname(String newname) {
				name=newname;
			}
			public void setlastname(String newlastname) {
				lastname=newlastname;
			}
		}

		


public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			encapsul enc=new encapsul();
			enc.setid(100);
			enc.setname("Sana");
			enc.setlastname("Khan");
			
			System.out.print("ID :"+enc.getid()+" "+"Name :"+enc.getName()+" "+"Surname :"+enc.getLastname());
	}

}
