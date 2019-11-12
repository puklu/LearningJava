package throwPackage;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee(1000, 18);
		try {
			e.applyLeave(20);
		} catch (InsufficientLeave e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
		
	}

}
