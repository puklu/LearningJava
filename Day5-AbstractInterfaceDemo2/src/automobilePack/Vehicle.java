package automobilePack;

public abstract class Vehicle  implements Automobile {
	
	protected int regNo;
	protected String model;
	protected int currentSpeed;
	
	

	public Vehicle(int regNo, String model, int currentSpeed) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.currentSpeed = currentSpeed;
	}
	
	

	public int getRegNo() {
		return regNo;
	}



	public String getModel() {
		return model;
	}



	public int getCurrentSpeed() {
		return currentSpeed;
	}

	


	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", model=" + model + ", currentSpeed=" + currentSpeed + "]";
	}



	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Vehicle has started";
	}

	@Override
	public abstract int increaseSpeed(int n);

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Vehicle has stopped";
	}

}
