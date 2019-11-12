//		
//public class SumOfPrimes {
//		public static void main(String[] args) {
//
//			int sum=0;
//			
//			int from=1;
//			int to=7;
//			
//			if (from==1) {
//				from=2;
//			}
//
//					
//			
//		 for(int j=from; j<=to; j++) {			
//				if(checkIfPrime(j)) {
//					sum+=j;		
//					System.out.println(j);
//				}
//		 }	
//		 
//			System.out.println(sum);			
//		
//	}
//
//		private static boolean checkIfPrime(int n) {
//			int flag=0;
//			for(int i=2; i<n; i++) {
//				
//				if(n%i==0) {
//					flag++;
//					
//				}
//				
//			}
//			
//			if(flag>0) {
//				return false;
//			}
//			else
//			return true;
//		}
//
//		
//}
//
//
//
//
//
///////////////////////////////////////////

public class SumOfPrimes {

	//Function
	int findSumOfPrimesBetween(int from, int to) {
	
	   int sum=0;
	   
	   if(from>to) {
		   int temp= to;
		   to=from;
		   from=temp;
	   }
	   
	   if (from<2) {
				from=2;
			}
	   
	   
	   
	    for(int j=from; j<=to; j++) {			
				if(checkIfPrime(j)) {
					sum+=j;		
					System.out.println(j);
				}
		 }	
	    
	    return sum;
		 
	  
		
		
		// Student code ends here
	}

	private boolean checkIfPrime(int n) {
		int flag=0;
		for(int i=2; i<n; i++) {
			
			if(n%i==0) {
				flag++;
				
			}
			
		}
		
		if(flag>0) {
			return false;
		}
		else
		return true;
	}
		
	

	void printSumOfPrimes(int from, int to) {
		System.out.println(findSumOfPrimesBetween(from, to));
	}

	public static void main(String[] args) {

		if(args.length!=2){
			System.out.println("Exactly 2 inputs required.");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			
			SumOfPrimes obj = new SumOfPrimes();
			obj.printSumOfPrimes(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		
	}
}

