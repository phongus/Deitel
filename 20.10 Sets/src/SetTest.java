import java.util.*;

/**
 * Created by phong.tran on 5/30/16.
 */
public class SetTest {
    public static void main(String[] args) {
        //  create and display a List<String>
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);

        //  eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }   //  end main

    //  create a Set from a Collection to eliminate duplicates
    private static void printNonDuplicates(Collection<String> values)
    {
        //  create a HashSet
        Set<String> set = new HashSet<String>(values);

        System.out.print("\nNonduplicates are: ");

        for(String value : set)
            System.out.printf("%s ", value);

        System.out.println();
    }   //  end method printNonDuplicates
}   //  end class SetTest
