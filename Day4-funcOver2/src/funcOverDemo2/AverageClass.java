package funcOverDemo2;

public class AverageClass {
	
	public double getAvg(double d1, int ...nums) {
		int sum=0;
		
		for (int n: nums) {
			sum+=n;
		}
		
		return ((sum+d1)/(nums.length+1));
	}

}
