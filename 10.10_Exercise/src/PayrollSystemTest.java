//	Fig. 10.9: PayrollSystemTest.java
//	Employee hierarchy test program.

public class PayrollSystemTest 
{
	public static void main(String[] args)
	{
		int currentMonth = 3;
		//	create subclass objects
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1,31,1990), 8000.00);
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(2,28,1990), 16.75, 40);
		CommissionEmployee commissionEmployee =
				new CommissionEmployee(
						"Sue", "Jones", "333-33-3333", new Date(3,31,1990), 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee =
				new BasePlusCommissionEmployee(
						"Bob", "Lewis", "444-44-4444", new Date(4,1,1990), 5000, .04, 300);
		Pieceworker pieceworker =
				new Pieceworker(
						"James", "Tran", "555-55-5555", new Date(7,2,1997), .60, 1500);
		

		//	create four-element Employee array
		Employee[] employees = new Employee[5];
		
		//	initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		employees[4] = pieceworker;
		
		System.out.println("Employees plocessed polymorphically: \n");
		
		//	generically process each element in array employees
		for ( Employee currentEmployee : employees)
		{
			System.out.println(currentEmployee);	//	invokes toString
			System.out.printf(
					"earned $%,.2f\n\n", currentEmployee.earnings());
		}	//	end for
		
		//	get type name of each object in employees array
		for ( int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s\n", j,
					employees[j].getClass().getName());
	}	//	end main
}	//	end class PayrollSystemTest
