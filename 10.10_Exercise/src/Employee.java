/* 10.8 (Payroll System Modification) Modify the payroll system of 
Figs. 10.4-10.9 to include private instance variable birthDate in 
class Employee. Use class Date of Fig. 8.7 to represent an employee's birthday. 
Add get methods to class Date. Assume that payroll is processed once per month. 
Create an array of Employee variables to store references to the various employee objects. 
In a loop, calculate the payroll for each Employee (polymorphically), and add a $100.00 
bonus to the person's payroll amount if the current month is the one in which the Employee's 
birthday occurs.
*/

//	Fig. 10.4: Employee.java
//	Employee abstract superclass

public abstract class Employee 
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	
	//	three-argument constructor
	public Employee(String first, String last, String ssn, Date bdate)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		birthDate = bdate;
	}	//	end three-argument Employee constructor
	
	//	set first name
	public void setFirstName(String first)
	{
		firstName = first;	//	should validate
	}	//	end method setFirstName
	
	//	return first name
	public String getFirstName()
	{
		return firstName;
	}	//	end method getFirstName
	
	//	set last name
	public void setLastName(String last)
	{
		lastName = last;	//	should validate
	}	//	end method setLastName
	
	//	return last name
	public String getLastName()
	{
		return lastName;
	}	//	end method getLastName
	
	// set social security number
	public void setSocialSecurityNumber(String ssn)
	{
		socialSecurityNumber = ssn;	//	should validate
	}	//	end method setSocialSecurityNumber
	
	//	return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}	//	end method getSocialSecurityNumber
	
	public void setBirthDate(Date bdate)
	{
		birthDate = bdate;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	//	return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format("%s %s\nSocial Security Number: %s\nBirthdate: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
	}	//	end method toString
	
	//	abstract method overridden by concrete subclasses
	public abstract double earnings();	//	no implementation here
}	//	end abstract class Employees
