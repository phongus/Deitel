import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by phong.tran on 5/30/16.
 */
public class SortedSetTest
{
    public static void main(String[] args)
    {
        //  create TreeSet from array colors
        String[] colors = {"yellow", "green", "black", "tan", "grey",
            "white", "orange", "red", "green" };
        SortedSet<String> tree=
                new TreeSet<String>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree); //  output contents of tree

        //  get headSet based on "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));

        //  get tailSet based upon "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));

        //  get first and last elements
        System.out.printf("first: %s\n", tree.first());
        System.out.printf("last : %s\n", tree.last());
    }   //  end main

    //  output SortedSet using enhanced for statement
    private static void printSet(SortedSet<String> set)
    {
        for (String s : set)
            System.out.printf("%s ", s);

        System.out.println();
    }   //  end method printSet
}   //  end Class SortedSetTest

