import java.util.LinkedList;
import java.util.Queue;

public class DsQueueInLinkedList {
    public static void main(String[] args) {

        // QUEUE (FIFO Data Structure) is an Interface and interfaces can't be instantiated
        // Two Classes which Implement Queue are:
        //      1. LinkedList        
        //      2. PriorityQueue


        Queue<String> queue = new LinkedList<>();

        // Add Elements from tail of the Queue (Enqueue) 
        queue.offer("Jack");
        queue.offer("Harry");
        queue.offer("Rick");
        queue.offer("Ronald");
        queue.offer("Marie");
        queue.offer("Jeff");
        queue.offer("David");


        // Check your Queue Items
        System.out.println(queue);              // [Jack, Harry, Rick, Ronald, Marie, Jeff, David]


        // Remove Items from head of the Queue (Dequeue)
        System.out.println(queue.poll());       // Jack


        // Check Size of the Queue
        System.out.println(queue.size());       // 6

    
        System.out.println(queue);              // [Harry, Rick, Ronald, Marie, Jeff, David]

    }
}
