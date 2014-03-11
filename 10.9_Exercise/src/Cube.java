
public class Cube extends ThreeDimensionalShape
{
	private double edge;
	
	public Cube()
	{
		setEdge(0.0);
	}
	
	public Cube(double e)
	{
		setEdge(e);
	}
	
	public void setEdge(double e)
	{
		edge = e;
	}
	
	public double getEdge()
	{
		return edge;
	}
	
	public double calculateArea()
	{
		return 6 * Math.pow(getEdge(), 2);
	}
	public double calculateVolume()
	{
		return  Math.pow(getEdge(), 3);
	}
	
	@Override
	public String toString()
	{
		return String.format("%sEdge: %.2f\n",super.toString(),getEdge());
	}
}
