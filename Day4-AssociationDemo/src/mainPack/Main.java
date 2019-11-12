package mainPack;

import addressPack.Address;
import personPack.Person;

public class Main {

	public static void main(String[] args) {
	
		Address addr = new Address("19", "Louise", "Delhi", "Delhi", 110043);
		
		Person pers = new Person("SSN1954","Batman", addr);
		
		System.out.println(pers);
	}

}
