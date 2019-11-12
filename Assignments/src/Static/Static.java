package Static;


public class Static {
      
//	private static double fahrTemp;
	
	public static double fahrenheitToCelcius(double fahrTemp) {
		
		return ((5.0 / 9.0) * (fahrTemp - 32));
		
	}
	
	public static double max(double a, double b) {
		
		if(a>b)
			return a;
		else
			return b;
	}
	
}
