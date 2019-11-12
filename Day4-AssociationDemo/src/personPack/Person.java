package personPack;

import addressPack.Address;

public class Person {
	
	private String ssn;
	private String name;
	private Address address;
	
	public Person(String ssn, String name, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
