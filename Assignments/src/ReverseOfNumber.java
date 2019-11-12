//
//////////////////////// CLASS//////////////////////////
//
//public class ReverseOfNumber {
//	
//	//Function
//		public String reverse(long input) {
//			
//			int count=0;
//	
//			//flag to indicate if number is negative
//			int negFlag=0;
//			
//			
//			long rem=0;
//			
//			
//			//if number is negative, removing its sign and storing the fact that it is negative in a variable
//			if(input<0) {
//				input = input*(-1);
//				negFlag++;
//			}
//			
//			//making a copy of input to be able to count the number of digits
//			long inCopy=input;
//			
////			System.out.println(input);
//			
//			
//			//removing trailing zeroes
//			while(rem==0) {
//				rem=inCopy%10;
////				System.out.println(rem);
//				if(rem!=0) {
//					break;
//				}
//				else
//				inCopy/=10;
////				System.out.println(inCopy);
//			}
//			
////			System.out.println("incopy "+inCopy);
//			long inCopy2=inCopy;
//			
//			//count the number of digits
//			while(inCopy2!=0) {
//				inCopy2/=10;
//				count++;
//				
//			}
//			
////			System.out.println("count "+count);
//			input=inCopy;
//			
//			String ch = "";
//			
//			long digit=0;
//			for(int i=count-1; i>=0; i--) {
//				
//				digit=input%10;
////				System.out.println("digit "+digit);
//				ch+=digit;
//				input/=10;
////				System.out.println("input "+input);
//				
//			}
//			
//			if (negFlag>0) {
//				return "-"+ch;
//			}
//			else
//			
//			return ch;
//			
//			
////		return 0;
//			
//			// STUDENT CODE ENDS HERE
//		}
//
//		private void printInReverse(long input) {
//			System.out.println(reverse(input));
//		}
//		
//////////////////////////////	MAIN  ///////////////////////	
//
//		public static void main(String[] args) {
//
//			if (args.length != 1) {
//				System.out.println("Exactly 1 input required.");
//				return;
//			}
//			
//			if(args[0].toUpperCase().endsWith("L")){
//				args[0] = args[0].substring(0, args[0].length()-1);
//				
//			}
//
//			try {
//				long input = Long.parseLong(args[0]);
//				ReverseOfNumber obj = new ReverseOfNumber();
//				obj.printInReverse(input);
//			} catch (NumberFormatException e) {
//				System.out.println("Only integers allowed.");
//			}
//		}
//	}
//////////////////////////////////// END /////////////////////////////////
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////copied from pe//////////////////////////////////////////////////////////

public class ReverseOfNumber {
	
	//Function
		public long reverse(long input) {
			
			int count=0;
	
			//flag to indicate if number is negative
			int negFlag=0;
			
			
			long rem=0;
			
			
			//if number is negative, removing its sign and storing the fact that it is negative in a variable
			if(input<0) {
				input = input*(-1);
				negFlag++;
			}
			
			//making a copy of input to be able to count the number of digits
			long inCopy=input;
			
//			System.out.println(input);
			
			
			//removing trailing zeroes
			while(rem==0) {
				rem=inCopy%10;
//				System.out.println(rem);
				if(rem!=0) {
					break;
				}
				else
				inCopy/=10;
//				System.out.println(inCopy);
			}
			
//			System.out.println("incopy "+inCopy);
			long inCopy2=inCopy;
			
			//count the number of digits
			while(inCopy2!=0) {
				inCopy2/=10;
				count++;
				
			}
			
//			System.out.println("count "+count);
			input=inCopy;
			
			String ch = "";
			
			long digit=0;
			for(int i=count-1; i>=0; i--) {
				
				digit=input%10;
//				System.out.println("digit "+digit);
				ch+=digit;
				input/=10;
//				System.out.println("input "+input);
				
			}
			
			
			
			if (negFlag>0) {
				long var = Long.parseLong(ch);
				return (-1)*var;
			}
			else {
				long var = Long.parseLong(ch);
			return var;
			}
			
//		return 0;
			
			// STUDENT CODE ENDS HERE
		}



	private void printInReverse(long input) {
		System.out.println(reverse(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}
		
		if(args[0].toUpperCase().endsWith("L")){
			args[0] = args[0].substring(0, args[0].length()-1);
			
		}

		try {
			long input = Long.parseLong(args[0]);
			ReverseOfNumber obj = new ReverseOfNumber();
			obj.printInReverse(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
