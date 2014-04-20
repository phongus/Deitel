//	Fig. 11.6: UsingChainedExceptions.java
//	Chained exceptions
public class UsingChainedExceptions 
{
	public static void main(String args [])
	{
		try
		{
			method1();	//	call method1
		}	//	end try
		catch (Exception exception)//	exceptions thrown from method1
		{
			exception.printStackTrace();
		}	//	end catch
	}	//	end main
	
	//	call method2; throw exceptions back to main
	public static void method1() throws Exception
	{
		try
		{
			method2();	//	call method2
		}	//	end try
		catch (Exception exception)
		{
			throw new Exception("Exception thrown in method1", exception);
		}	//	end catch
	}	//	end method method1
	
	//	call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		try
		{
			method3();	//	call method3
		}	//	end try
		catch (Exception exception)	//	exception thrown from method3
		{
			throw new Exception("Exception thrown in method2", exception);
		}	//	end catch
	}	//	end method method2
	
	//	throw Exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}	//	end method method3
}	//	end class UsingChainedExceptions
