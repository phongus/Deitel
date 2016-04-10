package CaseStudy;

/**
 *  Fig. 18.3: FactorialCalculator
 *  Recursive factorial method.
 */
public class FactorialCalculatorVisualizing
{
    //  recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(long number)
    {

        if ( number <= 1 )    //  test for base case
        {
            if ( number == 1 )
                System.out.printf("%d =",number);
            return 1;   //  base cases: 0! = 1 and 1! = 1
        }
        else    //  recursion step
        {
            System.out.printf("%d * ",number);
            return number * factorial( number - 1 );
        }
    }   //  end method factorial

    public static void factorialString( long number )
    {

    }

    //  output factorials for values 0-21
    public static void main(String[] args)
    {
        //  calculate the factorials of 0 through 21
        for (int counter = 0; counter <= 15 ; counter++)
            System.out.printf("\n%d! = %d\n\n", counter, factorial(counter) );
    }
}