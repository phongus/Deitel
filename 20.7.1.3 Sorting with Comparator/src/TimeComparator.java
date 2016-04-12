//  Fig. 20.8: TimeComparator.java
//  Custom Comparator class that compares two Time2 objects
import java.util.Comparator;

public class TimeComparator implements Comparator<Time2>
{
    public int compare(Time2 time1, Time2 time2)
    {
        int hourCompare = time1.getHour() - time2.getHour();    //  compare hour

        //  test the hour first
        if (hourCompare != 0)
            return hourCompare;

        int minuteCompare =
                time1.getMinute() - time2.getMinute();  //  compare minute

        //  then test the minute
        if (minuteCompare != 0)
            return minuteCompare;

        int secondCompare =
                time1.getSecond() - time2.getSecond();  //  compare second

        return secondCompare;   //  return result of comparing seconds
    }   //  end method compare
}   //  end class TimeComparator
