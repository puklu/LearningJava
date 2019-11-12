package Static;

import java.util.Scanner;

public class StaticTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int chosenOption = sc.nextInt();
		
		if(chosenOption==1) {
			

			double fahrTemp = sc.nextDouble();	
			System.out.println(Static.fahrenheitToCelcius(fahrTemp));			
		}
		else if(chosenOption==2) {	

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println(Static.max(a, b));			
		}
		
		else
			System.out.println("Invalid Input");
		
		sc.close();
	}

}
