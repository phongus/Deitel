// Fig. 11.4: UsingExceptions.java
//	Try catch finally exception handling mechanism.

public class UsingExceptions 
{
	public static void main(String[] args)
	{
		try
		{
			throwException();	//	call method throwException
		}
		catch(Exception exception)	//	exception thrown by throwException
		{
			System.err.println("Exception handled in main");
		}	//	end catch
		
		doesNotThrowException();
	}	//	end main
	
	//	demonstrate try...catch...finally
	public static void throwException() throws Exception
	{
		try	//	throw an exception and immediately catch it
		{
			System.out.println("Method throwException");
			throw new Exception();	//	generate exception
		}	//	end try
		catch (Exception exception)
		{
			System.err.println(
					"Exception handled in method throwException");
			throw exception;	//	re-throw for further processing
			
			//	code here would not be reached; would cause compilation errors
		}	//	end catch
		finally //	executes regardless of what occurs in try... catch
		{
			System.out.println("Finally executed in throwException");
		}	//	end finally
		
		//	code here would not be reached; would cause compilation errors
	}	//	end method throwException
	
	//	demonstrate finally when no exception occurs
	public static void doesNotThrowException()
	{
		try	//	try block does not throw an exception
		{
			System.out.println("Method doesNotThrowException");
		}
		catch (Exception exception)
		{
			System.err.println(exception);
		}	//	end catch
		finally	//	executes regardless of what occurs in try... catch
		{
			System.err.println(
					"Finally executed in doesNotThrowException");
		}	//	end finally
		
		System.out.println("End of method doesNotThrowException");
	}	//	end method doesNotThrowException
}	//	end class UsingExceptions
