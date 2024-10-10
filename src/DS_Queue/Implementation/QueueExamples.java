package DS_Queue.Implementation;

public class QueueExamples {
     public static void main(String[] args) {
            QueueImplementation queue = new QueueImplementation(5);

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println("Front element is: " + queue.peek());

            queue.dequeue();
            queue.dequeue();

            System.out.println("Queue size is " + queue.size());

            queue.enqueue(4);

            System.out.println("Front element is: " + queue.peek());
        }
    }
