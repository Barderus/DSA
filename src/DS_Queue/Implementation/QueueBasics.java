package DS_Queue.Implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Gabriel");
        queue.add("Leonardo");
        queue.add("Miguel");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Add elements to the queue using .offer()
        queue.offer("Ellen");
        System.out.println("\nNew queue: " + queue);

        /*
            Difference between .add() and .offer()
                offer method - tries to add an element to a queue, and returns false if the element can't be added
                (like in case when a queue is full), or true if the element was added, and doesn't throw any specific
                exception.

                add method - tries to add an element to a queue, returns true if the element was added, or throws an
                IllegalStateException if no space is currently available.
         */

        // Get size of the queue
        System.out.println("Size of the queue: " + queue.size() + " elements");

        // Iterating over a queue
        System.out.println("\nIterating over a queue: ");
        for (String s : queue) {
            System.out.println(s);
        }

        // Remove element of the queue using LinkedList .remove()
        System.out.println();
        System.out.println(queue.remove("Miguel"));

        // Remove the head element and return it using .poll()
        System.out.println(queue.poll());
        System.out.println("\nAfter removing the first element: " + queue);

        /*
            Difference between .remove() and .poll()
            * remove method - Since we are using a linkedList to implement a queue, now we can
            use its method to remove either by the object or by its index.

            * poll() - Remove the head of the queue. If the queue is empty it returns false instead
            of throwing an exception.
         */

        // Peek at the element at the front of the queue
        System.out.println("\nPeeking at the queue");
        System.out.println(queue.peek());

        // Retrieve the head element without removing it with .element()
        System.out.println("\nUsing element to retrieve the head element: ");
        System.out.println(queue.element());

        /*
            Difference between .peek() and .element()
            * peek method - Retrieves, but does not remove, the head of the queue. Returns null
            if the queue is empty

            * element method - Retrieves, but does not remove, the head of the queue. Throws an
            exception if the queue is empty
         */

        //  Check if the queue contains a specific element
        System.out.println("\nDoes the queue contain 'Ellen' ? " + queue.contains("Ellen"));
        System.out.println("Does the queue contain 'Gabriel'? " + queue.contains("Gabriel"));

        // Display the queue before clearing it
        System.out.println("\nQueue: " + queue);

        // Clear the queue
        queue.clear();
        System.out.println("\nQueue after clear: " + queue);

    }
}
