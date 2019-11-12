package pack1;



import java.util.Random;

public class Account {
	
	private static int count;
	
	private final int accNo;
	private String accType;
	private double balance;

////////////////////////
	
	static {
		count=0;
	}

///////////////////
	
	public Account(String accType, double balance) {
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
	
	public double withdraw(int amount) {
		balance -= amount;
		return balance;
	}

    public double deposit(int amount) {
    	balance +=amount;
    	return balance;
    }

  /////////////////////////
    
    
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}
	
	

}

