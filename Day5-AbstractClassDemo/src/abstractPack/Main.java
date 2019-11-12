package abstractPack;

public class Main {

	public static void main(String[] args) {
		
		Manager m = new Manager(1000, "Kilos", 56000, "HR", 15);

		System.out.println(m);
		
		Employee e = new Programmer(2000, "Looksie", 1200, 3, "Java");
	
	    System.out.println(e);
	}

}
