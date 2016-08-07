import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by phong.tran on 4/16/16.
 */
public class Algorithms2
{
    public static void main(String[] args)
    {
        //  initialize list1 and list2
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("black"); //  add "black" to the end of list2
        list2.add("red");   //  add "red" to the end of the list2
        list2.add("green"); //  add "green" to the end of list2

        System.out.print("Before addAll, list2 contains: ");

        //  display elements in list2
        for (String s : list2)
            System.out.printf("%s ", s);

        Collections.addAll(list2, colors);  //  add colors Strings to list2

        System.out.print("\nAfter addAll, list2 contains: ");

        //  display elements in list2
        for (String s : list2)
                System.out.printf("%s ", s);

        //  get frequency of "red"
        int frequency = Collections.frequency(list2, "red");
        System.out.printf(
                "\nFrequency of red in list2: %d\n", frequency);

        //  check whether list1 and list2 have elements in common
        boolean disjoint = Collections.disjoint(list1, list2);

        System.out.printf("list1 and list2 %s elements in common\n",
                (disjoint ? "do not have" : "have"));
    }   //  end main
}   //  end class Algorithms2
