package practice1;

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Hello from A");
    }

    public void display() {
        System.out.println("Hello from B");
    }
}


public class multipleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C obj = new C();
	        obj.show();
	        obj.display();
	}

}
