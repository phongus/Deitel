package SequentialFile; /**
 * Fig. 17.9: SequentialFile.ReadTextFile.java
 * This program reads a text files and displays each record.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
    private Scanner input;

    //  enable user to open file
    public void openFile()
    {
        try
        {
            input = new Scanner(new File("clients.txt"));
        }   //  end try
        catch(FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }   //  end catch
    }   //  end method openFile

    //  read record from file
    public void readRecords()
    {
        //  object to be written to screen
        AccountRecord record = new AccountRecord();

        System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
                "First Name", "Last Name", "Balance");
        try //  read records from files using Scanner object
        {
            while (input.hasNext())
            {
                record.setAccount(input.nextInt()); //  read account number
                record.setFirstName(input.next());  //  read first name
                record.setLastName(input.next());   //  read last name
                record.setBalance(input.nextDouble());  //  read balance

                //  display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f\n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }   //  end while
        }   //  end try
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        }   //  end catch
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file.");
            System.exit(1);
        }   //  end catch
    }   //  end method readRecords

    //  close files and terminate application
    public void closeFile()
    {
        if (input != null)
        {
            input.close();  //  close file
        }
    }   //  end method closeFile
}   //  end class SequentialFile.ReadTextFile
