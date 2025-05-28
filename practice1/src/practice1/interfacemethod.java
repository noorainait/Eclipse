package practice1;

interface Switch {
    void turnOn();
    void turnOff();
}

class Bulb implements Switch {
    public void turnOn() {
        System.out.println("Bulb is ON");
    }

    public void turnOff() {
        System.out.println("Bulb is OFF");
    }
}

public class interfacemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Switch s = new Bulb();
	        s.turnOn();
	        s.turnOff();
	}

}
