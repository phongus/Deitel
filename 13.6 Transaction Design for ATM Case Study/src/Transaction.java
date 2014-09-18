// Class for object Transaction

public abstract class Transaction 
{
	private int accountNumber;
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public abstract void execute();

}
