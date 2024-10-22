package DS_Queue.Implementation;

public class QueueExampleTwo {
        public static void main(String[] args) {
            Queue queue = new Queue();

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