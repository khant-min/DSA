import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * Queue = FIFO data structure. First-in Frist-out (ex. A line of people)
         * A collection designed for holding elements prior to processing 
         * Linear data structure
         * 
         * add = enqueue, offer()
         * remove = dequeue, poll()
         */

        /**
         * Where are queues useful?
         * 
         * 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
         * 2. Printer Queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, PriorityQueues, Breadth-first search
         */

        Queue<String> queue = new LinkedList<String>();

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());

        queue.offer("La Woon");
        queue.offer("Khant Min");
        queue.offer("Steve");
        queue.offer("Job");
        // System.out.println(queue.peek());
        System.out.println(queue.contains("Steve"));
        queue.poll();

        System.out.println(queue);
    }
}