package AccountDemo;

public class Account {
	
/////////////////Instance variables//////////////////	
	
	private int accountNo;
	private double accountBalance;
	private String accountType;
	private static int accountCount;
	
/////////////////////Constructor//////////////////////	
	
	public Account(int accountNo, double accountBalance, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		accountCount++;
		this.accountNo = accountCount;
	}

//////////////Method////////////////////////////////////

	public void depositAmount(double amount) {
		accountBalance +=amount;
	}
	
///////////////////Getters/////////////////////////////		

	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public static int getAccountCount() {
		return accountCount;
	}
/////////////////////////////////////////////////////	

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountBalance=" + accountBalance + ", accountType=" + accountType
				+ " Account count= " + accountCount + "]";
	}
	
	
	

}
