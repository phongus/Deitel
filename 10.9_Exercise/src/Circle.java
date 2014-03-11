
public class Circle extends TwoDimensionalShape
{
	private double radius;
	
	public Circle()
	{
		setRadius(0.0);
	}
	
	public Circle(double r)
	{
		setRadius(r);
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calculateArea()
	{
		return Math.PI * (Math.pow(radius, 2));
	}
	
	@Override
	public String toString()
	{
		return String.format("%sRadius: %.2f\n",super.toString(),getRadius());
	}
	
}
