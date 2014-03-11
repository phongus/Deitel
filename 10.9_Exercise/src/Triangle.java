
public class Triangle extends TwoDimensionalShape
{
	private double base;
	private double height;
	
	public Triangle()
	{
		setBase(0.0);
		setHeight(0.0);
	}
	
	public Triangle(double b, double h)
	{
		setBase(b);
		setHeight(h);
	}
	
	public void setBase(double b)
	{
		base = b;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}

	@Override
	public double calculateArea() 
	{
		return (getBase() * getHeight()) / 2;
	}
	
	@Override
	public String toString()
	{
		return String.format("%sBase: %.2f\nHeight: %.2f\n",super.toString(),getBase(),getHeight());
	}
	
	

	
}
