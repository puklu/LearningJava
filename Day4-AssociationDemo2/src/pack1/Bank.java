package pack1;

//import addressPack.Address;

public class Bank {

	public static void main(String[] args) {
		
		Address address = new Address("19", "Louise", "Delhi", "Delhi", 110043);
		Account account = new Account("Savings", 2500);
		
		AccountHolder acchold = new AccountHolder(1564, "Batman", address, account);
	
	    System.out.println(acchold);
	    
	    acchold.getAccount().deposit(1000);
	    
	    System.out.println(acchold);
	    
	}

}
