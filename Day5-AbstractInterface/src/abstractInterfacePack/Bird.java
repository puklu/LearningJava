package abstractInterfacePack;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("the bird took off");
		
	}

	@Override
	public void land() {
		System.out.println("the bird has landed");
		
	}

	@Override
	public void fly() {
	 System.out.println("the bird is flying");
	}

	@Override
	public void eat() {
		System.out.println("the bird is eating an insect");
		
	}
	
	public void layEggs() {
		System.out.println("the bird has laid eggs");
	}
	
	public void buildNest() {
		System.out.println("the bird has built the nest");
	}
	

}
