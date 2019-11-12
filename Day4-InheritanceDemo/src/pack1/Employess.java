package pack1;

public class Employess {

	protected int empID;
	protected String name;
	protected int salary;
	
	
public Employess(int empID, String name, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

//////////////	
	
	public int getEmpID() {
		return empID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
////////////	
	
	protected String getDetails() {
		return (empID+"  "+name+"  "+salary);
	}
	
	
}
