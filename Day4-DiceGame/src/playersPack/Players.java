package playersPack;

import dicePack.Dice;

public class Players {
	
//	Dice d1 = new Dice();

	Dice d1;
	Dice d2;
	
	public Players() {
		super();
		this.d1 = new Dice();
		this.d2 = new Dice();
	}
	
	public int thro() {
		
		int r1=d1.getFaceValue();
		int r2=d2.getFaceValue();
		
		return (r1+r2);
		
	}
	
	
}
