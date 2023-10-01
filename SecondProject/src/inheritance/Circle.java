package inheritance;

public class Circle extends Shape {

	private double diameter;

	/*
	 * This functionality is only for a circle because Rectangle does not have
	 * radius
	 */
	public double getRadius() {
		return diameter / 2;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	@Override
	public double calculateArea()
	{
		return 3.14*getDiameter()*getDiameter();
	}
	@Override
	public double calculatePerimeter()
	{
		return 2*3.14*getRadius();
	}
}
