/**
 * Created by P Trang on 10/7/2015.
 */
public class SumError
{
    public static int sum( int n )
    {
        if ( n == 0 )
        {
            return 0;
        }
        else
        {
            return n + sum( n - 1 );
        }
    }

    public static void main (String [] args)
    {
        System.out.println(sum(99));
    }
}
