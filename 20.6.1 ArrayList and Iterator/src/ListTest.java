import java.util.LinkedList;
import java.util.List;

/**
 * Created by P Trang on 4/1/2016.
 */
public class ListTest
{
    public static void main(String [] args)
    {
        //  add colors elements to list1
        String[] colors =
                { "black", "yellow", "green", "blue", "violet", "silver" };
        List<String> list1 = new LinkedList<String>();

        for (String color : colors)
            list1.add(color);
    }
}
