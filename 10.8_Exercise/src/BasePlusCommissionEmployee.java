// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class extends CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;	//	base salary per week
	
	//	six-argument constructor
	public BasePlusCommissionEmployee( String first, String last,
			String ssn, Date bdate, double sales, 
			double rate, double salary)
	{
		super(first, last, ssn, bdate, sales, rate);
		setBaseSalary(salary);	//	validate and store base salary
	}	//	end six-argument BasePlusCommissionEmployee constructor
	
	//	set base salary
	public void setBaseSalary(double salary)
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException(
						"Base salary must be >= 0.0" );
	}	//	end method setBaseSalary
	
	//	return base salary
	public double getBaseSalary()
	{
		return baseSalary;
	}	//	end method getBaseSalary
	
	//	calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}	//	end method earnings
	
	//	return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}	//	end method toString
}	//	end class BasePlusCommissionEmployee
