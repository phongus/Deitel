/**
 * Fig. 19.7: SelectionSortTest
 * Testing the selection sort class
 */
public class SelectionSortTest
{
    public static void main(String []args)
    {
        //  create object to perform selection sort
        SelectionSort sortArray = new SelectionSort(10);

        System.out.println("Unsorted array:");
        System.out.println(sortArray + "\n");   //  print unsorted array.

        sortArray.sort();

        System.out.println("Sorted array:");
        System.out.println(sortArray);
    }
}
