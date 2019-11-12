package pack1;

public class Address {
	
	private String doorNo;
	private String street;
	private String city;
	private String state;
	private long pincode;
	
	public Address(String doorNo, String street, String city, String state, long pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
	
	

}
