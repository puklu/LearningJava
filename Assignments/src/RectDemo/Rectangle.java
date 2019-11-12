
package RectDemo;

public class Rectangle {
	
	private String color;
	private double width;
//	private double height;
	private double area;
	private double perimeter;
	
	private double height;
	
	
	
//	private <height> void calcArea(height, width) {
//		
//		area = (height*width);
//		
//	}
//	
//	private void calcPerimeter(height, width) {
//		
//		perimater =  (2*(height+width));
//	}



////////////////getters and setters/////////////////

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return (height*width);
	}

	public double getPerimeter() {
		return (2*(height+width));
	}
	
////////////////////////////////////////////////////////	

}
