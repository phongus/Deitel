/**
 * Created by P Trang on 6/22/2016.
 */
public class BalanceInquiry extends Transaction
{
    //  BalanceInquiry constructor
    public BalanceInquiry (int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase)
    {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }   //  end BalanceInquiry constructor

    //  performs the transaction
    @Override
    public void execute()
    {
        //  get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        //  get the available balance for the account involved
        double availableBalance =
                bankDatabase.getAvailableBalance(getAccountNumber());

        //  get the total balance for the account involved
        double totalBalance =
                bankDatabase.getTotalBalance(getAccountNumber());

        //  display the balance information on the screen
        screen.displayMessageLine("\nBalance Information:");
        screen.displayMessage(" - Available balance: ");
        screen.displayDollarAmount( availableBalance );
        screen.displayMessage("\n - Total balance:     ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessage("");
    }   //  end method execute
}   //  end class BalanceInquiry
