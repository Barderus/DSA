package DS_Queue.Implementation;

class QueueImplementation {
    private int[] arr;   // Array to store queue elements
    private int front;   // Front points to the front element in the queue
    private int rear;    // Rear points to the last element in the queue
    private int capacity;  // Maximum capacity of the queue
    private int count;   // Current size of the queue

    // Constructor to initialize the queue
    public QueueImplementation(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Method to remove the front element from the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println("Inserted " + item);
    }

    // Method to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Method to return the size of the queue
    public int size() {
        return count;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (size() == capacity);
    }
}
