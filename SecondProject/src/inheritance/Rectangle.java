package inheritance;

public class Rectangle extends Shape {

	private double height;
	private double width;

	/*
	 * This is the specific formula for the area of the rectangle. This is the
	 * implementation of the Area Interface
	 */
	@Override
	public double calculateArea() {
		return height * width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*(height + width);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
