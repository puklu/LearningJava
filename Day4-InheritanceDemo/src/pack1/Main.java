package pack1;

public class Main {

	public static void main(String[] args) {
		
		Employess emp1 = new Employess(100, "Batsy", 45000);
		
        System.out.println(emp1.getDetails());

        Programmer p1 = new Programmer(200, "Blossom", 23000, 3, "Java");
        
        System.out.println(p1.getDetails());
	}

}
