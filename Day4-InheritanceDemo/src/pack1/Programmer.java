package pack1;

public class Programmer extends Employess {
	
	private int noOfProjects;
	private String skillset;
	
	public Programmer(int empID, String name, int salary, int noOfProjects, String skillset) {
		super(empID, name, salary);
		this.noOfProjects = noOfProjects;
		this.skillset = skillset;
	}
	
	public String getDetails() {
		
		return (super.getDetails()+" no of projects "+noOfProjects+" skillset "+skillset);
	}
	
	

}
