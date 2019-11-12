package stadiumPack;

import playersPack.Players;

public class Main {

	public static void main(String[] args) {
		
		Players p1 = new Players();
		
		System.out.println("player1: "+p1.thro());

        Players p2 = new Players();
		
		System.out.println("player2: "+p2.thro());

        if(p1.thro()>=p2.thro()) {
        	System.out.println("P1 wins");
        }
        else
        	System.out.println(("P2 wins"));
		
	}

}
