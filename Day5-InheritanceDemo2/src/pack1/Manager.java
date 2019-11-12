package pack1;

public class Manager extends Employess{
	
	private String deptName;
	private int empNum;
	
	public Manager(int empID, String name, int salary, String deptName, int empNum) {
		super(empID, name, salary);
		this.deptName = deptName;
		this.empNum = empNum;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getEmpNum() {
		return empNum;
	}
	
	public String getDetails() {
		
		return(super.getDetails()+"  "+deptName+"  "+empNum);
	
	}
	
	

}
