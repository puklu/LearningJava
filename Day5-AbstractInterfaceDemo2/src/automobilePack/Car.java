package automobilePack;

public class Car extends Vehicle{
	
	private String type;
	private int maxSpeed;
	
	

	public Car(int regNo, String model, int currentSpeed, String type, int maxSpeed) {
		super(regNo, model, currentSpeed);
		this.type = type;
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car [type=" + type + ", maxSpeed=" + maxSpeed + ", regNo=" + regNo + ", model=" + model
				+ ", currentSpeed=" + currentSpeed + "]";
	}



	@Override
	public int increaseSpeed(int n) {
		if((currentSpeed+n)<maxSpeed) {
			return (currentSpeed=currentSpeed+n);
		}
		else
		    return -1;
	}
     
	 
	
}
