package practice.question1;

class Encaptest{
	private String name;
	private String idnum;
	private int age;
	
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public String getIDNum() {
		return idnum;		
	}
	public void setAge(int newAge) {
		age=newAge;
	}
	public void setName(String newName) {
		name=newName;
	}
	public void setIdNum(String newId) {
	idnum=newId;	
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Encaptest encap=new Encaptest();
			encap.setName("khan");
			encap.setAge(23);
			System.out.print("Name :"+encap.getName()+" "+"Age :"+encap.getAge());
	}

}
