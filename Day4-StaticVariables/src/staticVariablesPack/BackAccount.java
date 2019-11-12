package staticVariablesPack;

import java.util.Random;

public class BackAccount {
	
	private static int count;
	
	private final int accNo;
	private String accType;
	private double balance;

////////////////////////
	
	static {
		count=0;
	}

///////////////////
	
	public BackAccount(String accType, double balance) {
		super();
//		this.accNo = ++count;
		this.accNo = getCount();
		this.accType = accType;
		this.balance = balance;
	}
	
	
///////////////////////

	public static int getCount() {
		
		Random rand = new Random();
		count = (int)(rand.nextInt(1500)+2000);
		
		return count;
	}

	public String getAccType() {
		return accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

////////////////////////


	@Override
	public String toString() {
		return "BackAccount [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}
	
	

}
