package inheritance;

public abstract class Shape implements Area {
	public String name;
	public String getName()
	{
		return name;
		
	}
	public void  setName(String name)
	{
		this.name=name;
	}
	abstract public double calculateArea();

	abstract public double calculatePerimeter();
	

}
