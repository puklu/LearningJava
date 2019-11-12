package throwPackage;

public class Employee {
	
	private int id;
	private int balanceLeaves;
	
	public Employee(int id, int balanceLeaves) {
		super();
		this.id = id;
		this.balanceLeaves = balanceLeaves;
	}
	
	public void applyLeave(int wantedLeaves) throws InsufficientLeave {
	
		if(balanceLeaves<wantedLeaves) {
			throw new InsufficientLeave("Leaves can't be issues....");
			
		}
		
		else {
			balanceLeaves -= wantedLeaves;
		    System.out.println("Leaves issued :D");
	}
		
	}
	
	

}
