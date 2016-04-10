import java.util.Scanner;

/**
 * Created by P Trang on 10/5/2015.
 */
public class MysteryMethod
{

    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);



        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.println();
        System.out.printf("%s %d %s %d %s %d.",
                "Mystery Method shows that if a is",
                a,
                "and b is",
                b,
                "then the solution is",
                mystery(a,b) );
        System.out.println();
        System.out.printf("%s\n%s\n%d %s %d %s %d",
                "Which is the equivalent to a * b:",
                "a * b =",
                a, "*", b, "=", a*b);
    }

    public static int mystery( int a, int b )
    {
        if ( b == 1 )
        {
            return a;
        }
        else
            return a + mystery( a, b - 1 );
    }
}
