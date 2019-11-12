import java.util.ArrayList;
import java.util.Arrays;


//////////////////////////////////////////////////////////////////////////////////////////

public class SumOfEvensAndOdds {
	
	
	public int[] getSumOfEvensAndOdds(int[] input) {
		
		ArrayList<Integer> arrEven = new ArrayList<Integer>() ;
		ArrayList<Integer> arrOdd = new ArrayList<Integer>() ;
		
		int evenSum=0;
		int oddSum=0;
		
		for (int i=0; i<input.length; i++) {
			if(input[i]%2==0) 
				arrEven.add(input[i]);
			else
				arrOdd.add(input[i]);
		}
		
		for(int i=0; i<arrEven.size(); i++) {
			evenSum+=arrEven.get(i);
		}
		for(int i=0; i<arrOdd.size(); i++) {
			oddSum+=arrOdd.get(i);
		}
		
		int x[] = new int[2];
		x[0]=evenSum;
		x[1]=oddSum;
		
		return x;
		
		
	}

	public void printSumOfEvensAndOdds(int[] input) {
		System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
	}

/////////////////////////////// Main ////////////////////////////////////////////////////

	public static void main(String[] args) {

		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
			obj.printSumOfEvensAndOdds(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}

	}
}

/////////////////////////////////////////////////////////////////////////////////////////
