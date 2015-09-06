/**
 * Created by P Trang on 8/28/2015.
 */
public class TransactionRecord
{
    private int account;
    private double amount;

    public TransactionRecord()
    {
        setAccount(0);
        setAmount(0.00);
    }

    public TransactionRecord(int acct, double amt)
    {
        setAccount(acct);
        setAmount(amt);
    }

    public void setAccount(int acct)
    {
        account = acct;
    }

    public void setAmount(double amt)
    {
        amount = amt;
    }

    public int getAccount()
    {
        return account;
    }

    public double getAmount()
    {
        return amount;
    }


}
