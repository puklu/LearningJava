package AccountDemo;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        String accttype1 = scanner.next();	        
	        double acctbalance1 = scanner.nextDouble();	        
	        double deposit1 = scanner.nextDouble();
	        
	        String accttype2 = scanner.next();
	        double acctbalance2 = scanner.nextDouble();
	        double deposit2 = scanner.nextDouble();
			
			Account acc1 = new Account(0, acctbalance1, accttype1);
			
			System.out.println("Acct No: "+acc1.getAccountNo());
			System.out.println("Acct Type: "+acc1.getAccountType());
			System.out.println("Acct Balance: "+acc1.getAccountBalance());
			
			
//			System.out.println(acc1);		
			acc1.depositAmount(deposit1);
			System.out.println();
			System.out.println("Balance after deposit: "+acc1.getAccountBalance());     
	         
			
			Account acc2 = new Account(0, acctbalance2, accttype2);
			
			
			System.out.println("Acct No: "+acc2.getAccountNo());
			System.out.println("Acct Type: "+acc2.getAccountType());
			System.out.println("Acct Balance: "+acc2.getAccountBalance());
			
			
//			System.out.println(acc1);		
			acc2.depositAmount(deposit2);
			System.out.println();
			System.out.println("Balance after deposit: "+acc2.getAccountBalance());
		
	}

}
