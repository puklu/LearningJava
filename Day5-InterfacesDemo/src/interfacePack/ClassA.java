package interfacePack;

public class ClassA implements Printable, Showable{

	@Override
	public void show() {
		System.out.println("This is Java world ..... " + count);
		
	}

	@Override
	public void print() {
		System.out.println("Welcome to the world");
		
	}
	
	
	
	

}
