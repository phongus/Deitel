import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

/**
 * Created by P Trang on 9/6/2015.
 */
public class TestDataWriter
{
    private Formatter oldMasterTestFile;    // used to output text into oldmast.txt
    private Formatter transTestFile;        //  used to output text into trans.txt

    public TestDataWriter()
    {
        oldMasterTestFile = null;
        transTestFile = null;
    }
    // create the two test files
    public void openFile()
    {
        try
        {
            oldMasterTestFile = new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\oldmast.txt");   //  open the oldmast.txt file
            transTestFile   =   new Formatter("C:\\Users\\P Trang\\git\\Deitel\\Deitel\\Exercise 17.2\\src\\trans.txt");     //  open the trans.txt file
        }
        catch (FileNotFoundException fnfe)
        {
            System.err.println("Error opening or creating the file.");
            System.exit(1); //  terminate the program
        }   //  end catch
        catch (SecurityException securityException)
        {
            System.err.println("You do not have write access to this file.");
            System.exit(1); //  terminate the program
        }   //  end catch
    }   //  end method openFile

    public void writeOldMaster()
    {
        try
        {
            oldMasterTestFile.format(
                    "%d %s %s %.2f\n" +
                    "%d %s %s %.2f\n" +
                    "%d %s %s %.2f\n" +
                    "%d %s %s %.2f\n",
                    100, "Alan", "Jones", 348.17,
                    300, "Mary", "Smith", 27.19,
                    500, "Sam", "Sharp", 0.00,
                    700, "Suzy", "Green", -14.22);
        }
        catch (FormatterClosedException fce)
        {
            System.err.println("Error writing to file.");
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("Invalid input.");
        }   //  end catch
        finally
        {
            oldMasterTestFile.close();
        }
    }
    public void writeTrans()
    {
        try
        {
            transTestFile.format(
                    "%d %.2f\n" +
                    "%d %.2f\n" +
                    "%d %.2f\n",
                    300, 83.89,
                    700, 80.78,
                    700, 1.53);
        }
        catch (FormatterClosedException fce)
        {
            System.err.println("Error writing to file.");
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("Invalid input.");
        }   //  end catch
        finally
        {
            transTestFile.close();
        }
    }
}
