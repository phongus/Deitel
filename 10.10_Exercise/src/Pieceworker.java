/*
 * 10.10 (Payroll System Modification) Modify the payroll 
 * system of Figs. 10.4-10.9 to include an additional 
 * Employee subclass PieceWorker that represents an employee
 * whose pay is based on the number of pieces of merchandise
 * produced. Class PieceWorker should contain private 
 * instance variables wage (to store the employee's wage
 * per piece) and pieces (to store the number of pieces 
 * produced). Provide a concrete implementation of method 
 * earnings in class PieceWorker that calculates the 
 * employee's earnings by multiplying the number of 
 * pieces produced by the wage per piece. Create an 
 * array of Employee variables to store references to 
 * objects of each concrete class in the new Employee 
 * hierarchy. For each Employee, display its String 
 * representation and earnings.
 * 
 */
public class Pieceworker extends Employee 
{
	private double wage;
	private int pieces;
	
	public Pieceworker(String first, String last, String ssn,
			Date bdate, double w, int p)
	{
		super(first, last, ssn, bdate);
		setWage(w);
		setPieces(p);
	}
	
	public void setWage(double w)
	{
		wage = w;
	}
	
	public void setPieces(int p)
	{
		pieces = p;
	} 
	
	public double getWage()
	{
		return wage;
	}
	
	public int getPieces()
	{
		return pieces;
	}

	@Override
	public double earnings() {
		return getPieces() * getWage();
	}
	
	@Override
	public String toString()
	{
		return String.format("Pieceworker: %s\n%s: $%,.2f\n%s: %d",
				super.toString(), "Wage", getWage(), "Pieces", getPieces());
	}	//	end method toString

}
