package mainPack;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
		int res=0;
		
		try {
	    int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
	    
	    res=a/b;
	    System.out.println(res);
		}
		
		
		catch(NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("input format mismatch "+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("error: "+e.getMessage());
		}
		
		
		catch(Exception e){
			System.out.println("what");
		}
//		finally {	
//	    System.out.println(" :D");
//		}
	}

}
