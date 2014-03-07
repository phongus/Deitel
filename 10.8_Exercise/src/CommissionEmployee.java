//	Fig. 10.7: CommissionEmployee.java
//	CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee
{
	private double grossSales; //	gross weekly sales
	private double commissionRate;	//	commission percentage
	
	//	five-argument constructor
	public CommissionEmployee(String first, String last, String ssn,
			Date bdate, double sales, double rate)
	{
		super(first, last, ssn, bdate);
		setGrossSales(sales);
		setCommissionRate(rate);
	}	//	end five-argument CommissionEmployee constructor
	
	//	set commissioned rate
	public void setCommissionRate(double rate)
	{
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
	}	//	end method setCommissionRate
	
	//	return commission rate
	public double getCommissionRate()
	{
		return commissionRate;
	}	//	end method getCommissionRate
	
	//	set gross sales amount
	public void setGrossSales(double sales)
	{
		if ( sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
	}	//	end method setGrossSales
	
	//	return gross sales amount
	public double getGrossSales()
	{
		return grossSales;
	}	//	end method getGrossSales
	
	//	calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}	//	end method earnings
	
	//	return String representation of CommissionEmployee object
	@Override
	public String toString()
	{
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}	//	end method toString
}	//	end class CommissionEmployees
