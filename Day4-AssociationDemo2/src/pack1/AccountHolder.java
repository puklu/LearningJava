package pack1;

public class AccountHolder {
	
	private int ID;
	private String name;
    private Address address;
    private Account account;
    
	public AccountHolder(int iD, String name, Address address, Account account) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
		this.account = account;
	}

	@Override
	public String toString() {
		return "AccountHolder [ID=" + ID + ", name=" + name + ", Address=" + address + ", account=" + account + "]";
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public Account getAccount() {
		return account;
	}
    
    
    
}
