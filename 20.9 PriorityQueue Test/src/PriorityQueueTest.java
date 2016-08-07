//  Fig. 20.15: PriorityQueueTest.java
//  PrioirityQueue test program.
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //  queue of capacity 11
        PriorityQueue<Double> queue = new PriorityQueue<Double>();

        //  insert elements to queue

        queue.add(9.8);
        queue.add(5.4);
        queue.add(3.2);

        System.out.print("Polling from queue: ");

        //  display elements in a queue
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());   //  view top element
            queue.poll();   //  remove top element
        }   //  end while
    }   //  end main
}   //  end class PriorityQueueTest
