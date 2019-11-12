package automobilePack;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car(8514, "WagonR", 40, "Hatchback", 240);
		
		c.increaseSpeed(30);
		
		System.out.println(c.currentSpeed);

	}

}
