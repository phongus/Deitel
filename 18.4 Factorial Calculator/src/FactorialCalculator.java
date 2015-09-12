import java.math.BigInteger;

/**
 * Fig. 18.4: FactorialCalculator.java
 * Recursive factorial method.
 */
public class FactorialCalculator
{
    //  recursive method factorial (assumes its parameter is >= 0)
    public static BigInteger factorial(BigInteger number)
    {
        if(number.compareTo(BigInteger.ONE) <= 0 )  //  test base case
            return BigInteger.ONE;
        else    //  base cases: 0! = 1 and 1! = 1
            return number.multiply(
                factorial(number.subtract(BigInteger.ONE)));
    }   //  end method factorial

    //  output factorials for values 0-50
    public static void main(String[] args)
    {
        //  calculate the factorials of 0 through 50
        for (int counter = 0; counter <= 50; counter++)
            System.out.printf("%d! = %d\n", counter,
                    factorial(BigInteger.valueOf(counter)));
    }
}
