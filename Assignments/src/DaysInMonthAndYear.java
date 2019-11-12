
public class DaysInMonthAndYear {
	
	public int getMaxDays(int month, int year) {
		
		if (year>0){
			
			switch(month){
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				     return 31;
//				     break;
				
				case 4:
				case 6:
				case 9:	
				case 11:
					return 30;
//					break;
					
			    default: return -1;	
//			    break;
			    
			    case 2: 
			    	if (year%4==0 && year>0){
						if(year%100==0){
							if(year%400==0){
								if(month==2){
									return 29;
								}
							}
						}
					}
			    	else
			    		return 28;
			}
		}
		
		else {
			return -2;
		}
		
		return 0;
		
	}

	public void printMaxDays(int month, int year) {
		System.out.print(getMaxDays(month, year));
	}

	 public static boolean isleap(int year){
		return true;
	    }


	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			DaysInMonthAndYear obj = new DaysInMonthAndYear();
			obj.printMaxDays(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		

	}
}



