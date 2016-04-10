import java.util.Scanner;

/**
 *  Fig. 19.5: BinarySearchTest.java
 *  Use binary search to locate an item in an array
 */
public class BinarySearchTest
{
    public static void main(String[] args)
    {
        //  create Scanner object to input data
        Scanner input = new Scanner(System.in);

        int searchInt;  //  search key
        int position;   //  location of search key in array

        //  create array and output it
        BinaryArray searchArray = new BinaryArray( 15 );
        System.out.println( searchArray );

        //  get input from user
        System.out.print(
                "Please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();    //  read an int from user
        System.out.println();

        //  repeatedly input an integer; -1 terminates the program
        while ( searchInt != -1 )
        {
            //  use binary search to try and find integer
            position = searchArray.binarySearch(searchInt);

            //  return value of -1 indicates integer was not found
            if ( position == -1 )
                System.out.println( "The integer " + searchInt +
                    " was not found.\n");
            else
                System.out.println("The integer " + searchInt +
                    " was found in position " + position + ".\n");

            //  get input from user
            System.out.print(
                    "Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();    //  read in int from user
            System.out.println();
        }
    }
}
