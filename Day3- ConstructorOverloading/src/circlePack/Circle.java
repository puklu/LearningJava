package circlePack;

public class Circle {
	
	private double radius;
	private String color;
	
	
	
	
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	

	public Circle() {
		this.radius = 5.5;
		this.color = "red";
		
	}
	
	public Circle(String color) {
		this.radius = 5.5;
		this.color = color;
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = "grey";
		
	}






	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	

}
