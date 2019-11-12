package abstractPack;

public class Programmer extends Employee{
	
	private int noOfProjects;
	private String skillset;
	
	
	
	public Programmer(int empId, String empName, int bsal, int noOfProjects, String skillset) {
		super(empId, empName, bsal);
		this.noOfProjects = noOfProjects;
		this.skillset = skillset;
	}



	@Override
	public double calcNetSalary() {
		// TODO Auto-generated method stub
		return (bsal+bsal*2);
	}



	@Override
	public String toString() {
		return "Programmer [noOfProjects=" + noOfProjects + ", skillset=" + skillset + ", empId=" + empId + ", empName="
				+ empName + ", bsal=" + bsal + " Net Salary " +calcNetSalary() + "]";
	}
	
	
	

}
