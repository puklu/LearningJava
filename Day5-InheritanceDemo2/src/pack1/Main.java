package pack1;

public class Main {

	public static void main(String[] args) {
		
		Employess e1 = new Employess(100, "Batman", 45000);
		
		Employess e2 = new Programmer(200, "Blossom", 55000, 5, "Java");
		
		System.out.println("e1 "+e1.getDetails());
		e1.getEmpID();
		e1.getName();
		e1.getSalary();
		
		System.out.println("e2 "+e2.getDetails());
		e2.getEmpID();
		e2.getName();
		e2.getSalary();
		
		
		Programmer p1 = (Programmer)e2;
		
		System.out.println(p1.getNoOfProjects());
		p1.getSkillset();
		
		
		Employess[] emparr = new Employess[4];
		emparr[0] = new Manager(300, "Vivek", 70000, "IT", 30);
		emparr[1] = new Programmer(200, "Goldy", 30000, 5, "Testing");
	    emparr[2] = new Employess(100, "Hulk", 50000);
	    emparr[3] = new Manager(301, "Rava", 30000, "Fin",15);
	
	    for(Employess e:emparr) {
	    	System.out.println(e.getDetails());
	    	System.out.println(Tax.calTax(e));
	    }
	    
	}

}
