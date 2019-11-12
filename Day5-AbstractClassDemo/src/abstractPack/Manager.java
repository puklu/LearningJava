package abstractPack;

public class Manager extends Employee{
	
	private String deptName;
	private int empnum;
	
	
	
	public Manager(int empId, String empName, int bsal, String deptName, int empnum) {
		super(empId, empName, bsal);
		this.deptName = deptName;
		this.empnum = empnum;
	}



	@Override
	public double calcNetSalary() {
		
		
		return (bsal+bsal*3);
	}



	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", empnum=" + empnum + ", empId=" + empId + ", empName=" + empName
				+ ", bsal=" + bsal + " Net Salary " + calcNetSalary() + "]";
	}
	
	
	

}
