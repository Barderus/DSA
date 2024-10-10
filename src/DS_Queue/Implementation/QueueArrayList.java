package DS_Queue.Implementation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;
    private int count;

    // Constructor
    public Queue() {
        this.front = this.rear = null;
        this.count = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
        System.out.println("Inserted " + item);
    }

    // Method to remove the front element from the queue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removing " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
        count--;
    }

    // Method to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Method to return the size of the queue
    public int size() {
        return count;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}
