/**
 * Created by P Trang on 10/7/2015.
 */
public class RecursivePowerMethod
{
    public static int power( int a, int b )
    {
        if ( b == 1 )
            return a;
        else
            return a * power(a, b-1);
    }

    public static void main (String [] args)
    {
        System.out.printf("%s %d", "3 to the power of 2 is: ", power(3,3));
    }
}
