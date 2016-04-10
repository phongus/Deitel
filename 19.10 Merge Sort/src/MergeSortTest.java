/**
 * Created by P Trang on 2/16/2016.
 */
public class MergeSortTest
{
    public static void main(String[] args)
    {
        //  create object to perform merge sort
        MergeSort sortArray = new MergeSort(10);

        //  print unsorted array
        System.out.println("Unsorted:" + sortArray + "\n" );

        sortArray.sort();

        //  print sorted array
        System.out.print("Sorted: " + sortArray);
    }
}
