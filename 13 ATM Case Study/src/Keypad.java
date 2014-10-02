//	Keypad.java
//	Represents the keypad of the ATM
import java.util.Scanner;	//	program uses Scanner to obtain user input

public class Keypad 
{
	private Scanner input;	//	reads data from the command line
	
	//	no-argument constructor initializes the Scanner
	public Keypad()
	{
		input = new Scanner(System.in);
	}	//	end no-argument Keypad constructor
	
	//	return an integer value entered by user
	public int getInput()
	{
		return input.nextInt();
	}	//	end method getInput
}	//	end class Keypad
