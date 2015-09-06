/**
 *  Fig. 18.3: FactorialCalculator
 *  Recursive factorial method.
 */
public class FactorialCalculator
{
    //  recursive method factorial (assumes its parameter is >= 0)
    public long factorial (long number)
    {
        if (number <= 1)
            return 1;   //  test for base case
        else
            return number * factorial(number - 1);
    }   //  end method factorial

    //  output factorials for values 0-21
    public static void main(String[] args)
    {
        //  calculate the factorials of 0 through 21
        for (int counter = 0; counter <= 21; counter++)
            System.out.printf("%d! = %d\n", counter, factorial(counter) );
    }
}
