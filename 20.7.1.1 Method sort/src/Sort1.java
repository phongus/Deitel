//  Fig. 20.6: Sort1.java
//  Collections method sort
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1
{
    public static void main(String[] args)
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spadeeos"};

        //  Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);   //  create List
        System.out.printf("Unsorted array elements: %s\n", list);

        Collections.sort(list); //  sort ArrayList

        //  output list
        System.out.printf("Sorted array elements: %s\n", list);
    }
}
