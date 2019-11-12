package IntegerDivision;

import java.util.InputMismatchException;

public class IntegerDivision {

	public static void main(String[] args) {
		
		
		Integer a =  Integer.parseInt(args[0]);
		Integer b =  Integer.parseInt(args[1]);
		double res = 0;

//		System.out.println(b);
		
		try {
			res=a/b;
			System.out.println("Quotient="+res);
		}
		catch(NumberFormatException e) {
			System.out.println("A non-integer input was given");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 inputs were not supplied");
		}
		catch(ArithmeticException e ) {
			System.out.println("Attempted to divide by zero");
		}
		
		
		

		

	}

}
