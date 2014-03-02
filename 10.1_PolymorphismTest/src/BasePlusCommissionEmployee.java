//	Fig 9.8 BasePlusCommissionEmployee.java
//	private superclass members cannot be accessed in a subclass

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;	//	base salary per week
	
	//	six-argument constructor
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary)
	{
		//	explicit call to superclass CommissionEmployee constructor
		super(first, last, ssn, sales, rate);
		
		setBaseSalary(salary);	//	validate and store base salary
		//	end six-argument  BasePlusCommissionEmployee constructor
	}
	
	//	set base salary
	public void setBaseSalary(double salary)
	{
		if (salary >=0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}	//	end method setBaseSalary
	
	//	return base salary
	public double getBaseSalary()
	{
		return baseSalary;
	}	//	end method getBaseSalary
	
	//	calculate earnings
	@Override //	indicates that this method overrides a superclass method
	public double earnings()
	{
		//	not allowed: commissionRate and grossSale private in superclass
		return baseSalary + (getCommissionRate() * getGrossSales());
	}	//	end method earnings
	
	//	return String representation of BasePlusCommissionEmployee
	@Override //	indicate that this method overrides a superclass method
	public String toString()
	{
		//	not allowed: attempts to access private superclass members
		return String.format("%s %s\n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	}
}
