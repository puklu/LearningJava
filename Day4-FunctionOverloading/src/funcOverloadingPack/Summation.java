package funcOverloadingPack;

public class Summation {
	
	public int add(int x, int y) {
		return (x+y);
	}
	
	public int add(int x, int y, int z) {
		return (x+y+z);
	}
	
	public double add(double x, double y) {
		return (x+y);
	}
	
	public double add(int x, double y) {
		return (x+y);
	}

}
