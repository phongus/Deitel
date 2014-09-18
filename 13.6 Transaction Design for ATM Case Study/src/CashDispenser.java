
public class CashDispenser 
{
	private int count = 500;
	
	public boolean isSufficientCashAvailable(int cash)
	{
		// made some extra stuff
		
		boolean cashAvailability;
		
		if(cash / 100 > 500)
			cashAvailability = false;
		else
			cashAvailability = true;
		
		return cashAvailability;
	}
	
	public void dispenseCash()
	{
		
	}
	

}
