import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by P Trang on 8/24/2015.
 */
public class AccountReader
{
    AccountRecord accountRecord = new AccountRecord();
    TransactionRecord transactionRecord = new TransactionRecord();
    private Scanner inOldMaster;
    private Scanner inTransaction;
    private Formatter outNewMaster;

    public void openOldMaster()
    {
        try
        {
            inOldMaster = new Scanner(new File("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\oldmast.txt"));

            while(inOldMaster.hasNext())
            {
                accountRecord.setAccount(inOldMaster.nextInt());
                accountRecord.setFirstName(inOldMaster.next());
                accountRecord.setLastName(inOldMaster.next());
                accountRecord.setBalance(inOldMaster.nextDouble());
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.err.println("Error opening file");
            System.exit(1);
        }
        catch (NoSuchElementException nsee)
        {
            System.err.println("File improperly formed");
            inOldMaster.close();
            System.exit(1);
        }
        catch (IllegalStateException ise)
        {
            System.err.println("Error reading from file.");
            System.exit(1);
        }   //  end catch
        finally
        {
            if (inOldMaster != null)
                inOldMaster.close();
            //  close the Scanner and the file
        }   //  end finally
    }

    public void openTrans()
    {
        try
        {
            inTransaction = new Scanner(new File("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\trans.txt"));
            transactionRecord.setAccount(inTransaction.nextInt());
            transactionRecord.setAmount(inTransaction.nextDouble());
        }
        catch (FileNotFoundException fnfe)
        {
            System.err.println("Error opening file");
            System.exit(1);
        }
    }

    public void openNewMaster()
    {
        try
        {
            outNewMaster = new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\newmast.txt");
        }
        catch (SecurityException securityException)
        {
            System.err.println(
                    "You do not have write access to this file.");
            System.exit(1); //  terminate the program
        }   //  end catch
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening or creating file.");
            System.exit(1); //  terminate the program
        }   //  end catch
    }

    public void outputNewMaster()
    {

        try
        {
            outNewMaster = new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\newmast.txt");

            //  write new record
            outNewMaster.format("%d %s %s %.2f\n", accountRecord.getAccount(),
                    accountRecord.getFirstName(), accountRecord.getLastName(),
                    accountRecord.getBalance());

        }
        catch (FormatterClosedException formatterClosedException)
        {
            System.err.println("Error writing to file.");
            return;
        }   //  end catch
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening or creating file.");
            System.exit(1); //  terminate the program
        }
        finally
        {
            if(outNewMaster != null)
                outNewMaster.close();
        }
    }


}
