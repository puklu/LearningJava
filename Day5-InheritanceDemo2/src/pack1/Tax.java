package pack1;

public class Tax {
	
	public static double calTax(Employess e) {
		
		if(e instanceof Manager) {
			return (e.getSalary()*0.12);
		}
		else if(e instanceof Programmer) {
			return (e.getSalary()*0.10);
		}
		
		else
			return 0;
	}

}
