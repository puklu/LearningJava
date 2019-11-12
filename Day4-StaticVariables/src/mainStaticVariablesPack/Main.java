package mainStaticVariablesPack;

import staticVariablesPack.BackAccount;

public class Main {

	public static void main(String[] args) {
		
		BackAccount acc1 = new BackAccount("Savings", 6000);
		
		System.out.println(acc1);
		
        BackAccount acc2 = new BackAccount("Current", 2000);
		
		System.out.println(acc2);
		
        BackAccount acc3 = new BackAccount("Current", 4000);
		
		System.out.println(acc3);
		
		System.out.println("Balalala: "+acc2.getAccType());
		
	}

}
