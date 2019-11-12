package dicePack;

import java.util.Random;

public class Dice {
	
	private int faceValue;
	
	public Dice() {
		Random rand = new Random();
		
		faceValue=((int)(rand.nextInt(5)+1));
	}

	public int getFaceValue() {
		return faceValue;
	}

	
	

}
