import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReading {
	
	private int n1;
	private int n2;
	
	public double process1() {
		
		double res=0;
		
		System.out.println("enter two integers");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			n1 = Integer.parseInt(br.readLine());
			n2 = Integer.parseInt(br.readLine());
			res=(double)n1/n2;
			
		} catch (NumberFormatException | IOException e) {

			System.out.println("Error occured");
		}
		
		
		return res;
		
	
	}
	
	public double process2() throws NumberFormatException, IOException, ArithmeticException {
		
       double res=0;
		
		System.out.println("enter two integers");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n1 = Integer.parseInt(br.readLine());
		n2 = Integer.parseInt(br.readLine());
		res=(double)n1/n2;
		
		return res;
	}

}
