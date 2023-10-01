package inheritance;

public class Triangle extends Shape{
	
	private double base;
	private double side;
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	public void setHeight(double side) {
		this.side = side;
	}
    @Override
	public double calculateArea() {
		return 1/2*base*side;
	}
    @Override
   	public double calculatePerimeter() {
   		return base+side+side;
   	}
}
