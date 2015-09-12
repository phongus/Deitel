import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by P Trang on 9/6/2015.
 */
public class FileMatch
{
    AccountReader accountReader = new AccountReader();
    private Scanner inOldMaster;
    private Scanner inTransaction;
    private Formatter outNewMaster;
    private List<AccountRecord> accountRecordList = new ArrayList<AccountRecord>();
    private List<TransactionRecord> transactionRecordList = new ArrayList<TransactionRecord>();
    private List<Integer> logList = new ArrayList<Integer>();

    public void openOldMaster()
    {
        try
        {
            inOldMaster = new Scanner(new File("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\oldmast.txt"));

            while(inOldMaster.hasNext())
            {
                AccountRecord oldMasterAR = new AccountRecord();
                oldMasterAR.setAccount(inOldMaster.nextInt());
                oldMasterAR.setFirstName(inOldMaster.next());
                oldMasterAR.setLastName(inOldMaster.next());
                oldMasterAR.setBalance(inOldMaster.nextDouble());

                accountRecordList.add(oldMasterAR);
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

            while(inTransaction.hasNext())
            {
                TransactionRecord transactionRecord = new TransactionRecord();
                transactionRecord.setAccount(inTransaction.nextInt());
                transactionRecord.setAmount(inTransaction.nextDouble());

                transactionRecordList.add(transactionRecord);
            }

        }
        catch (FileNotFoundException fnfe)
        {
            System.err.println("Error opening file");
            System.exit(1);
        }
        finally
        {
            inTransaction.close();
        }
    }

    public void outputNewMaster()
    {

        try
        {
            outNewMaster = new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\newmast.txt");

            for(AccountRecord ar : accountRecordList)   //  for every Account Record
            {
                outNewMaster.format("%d %s %s %.2f\n",ar.getAccount(), ar.getFirstName(),ar.getLastName(),ar.getBalance());
            }

            outNewMaster.close();

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

    public void processTrans()
    {
        boolean findMatch = false;
        for(TransactionRecord tr : transactionRecordList)   //for every Transaction Record
        {
            if(findMatch(tr) != null)
                findMatch(tr).combine(tr);
        }
        writeLog();
    }

    public AccountRecord findMatch(TransactionRecord trMatch)
    {
        AccountRecord accountRecord = null;
        boolean match = false;
        for(AccountRecord ar : accountRecordList)   //  for every Account Record
        {
            if(trMatch.getAccount() == ar.getAccount())
            {
                accountRecord = ar;
                match = true;
            }
        }
        if (match == false)
            logList.add(trMatch.getAccount());

        return accountRecord;
    }

    public void writeLog()
    {
        try
        {
            Formatter outLog = new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\log.txt");

            for(int log : logList)   //  for every Account Record
            {
                outLog.format("Unmatched transaction record for account number %d\n", log);
            }

            outLog.close();

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
