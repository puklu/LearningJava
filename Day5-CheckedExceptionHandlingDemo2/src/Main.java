import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		ConsoleReading cr = new ConsoleReading();
		
		
//		System.out.println(cr.process1());
		
		try {
			System.out.println(cr.process2());
		} catch (NumberFormatException | ArithmeticException | IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error occurred "+e.getMessage());
		}

	}

}
