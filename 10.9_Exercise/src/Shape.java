/*
 * 10.9 (Project: Shape Hierarchy) Implement the Shape hierarchy 
 * shown in Fig. 9.3. Each TwoDimensionalShape should contain method 
 * getArea to calculate the area of the two-dimensional shape. 
 * Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume, 
 * respectively, of the three-dimensional shape. Create a program that uses an array of Shape ref- erences to objects of each concrete class in the hierarchy. The program should print a text description of the object to which each array element refers. Also, in the loop that processes all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a ThreeDimensionalShape. If it's a TwoDimensionalShape, display its area. 
 * If it’s a ThreeDimensionalShape, display its area and volume.
 * */

public class Shape 
{
	private double side;
	
	public Shape()
	{
		setSide(0.0);
	}
	
	public Shape(double s)
	{
		setSide(s);
	}
	
	public void setSide(double s)
	{
		side = s;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public String toString()
	{
		return String.format("%s\n%d sides\n", getClass().getName(), getSide());
	}
}
