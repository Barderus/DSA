package Assignments.Assignment3;

public class Question4 {
    public static void main(String[] args) {
        Queue<Integer> S = new ArrayQueue<>();  // contents: ()
        ArrayQueue<Integer> queue = new ArrayQueue<>();


        S.enqueue(5);                           // contents: (5)
        S.enqueue(3);                           // contents: (5, 3)
        System.out.println(S.size());           // contents: (5, 3)     outputs 2
        System.out.println(S.dequeue());        // contents: (3)        outputs 5
        System.out.println(S.isEmpty());        // contents: (3)        outputs false
        System.out.println(S.dequeue());        // contents: ()         outputs 3
        System.out.println(S.isEmpty());        // contents: ()         outputs true
        System.out.println(S.dequeue());        // contents: ()         outputs null
        S.enqueue(7);                           // contents: (7)
        S.enqueue(9);                           // contents: (7, 9)
        System.out.println(S.first());          // contents: (7, 9)     outputs 7
        S.enqueue(4);                           // contents: (7, 9, 4)
        System.out.println(S.size());           // contents: (7, 9, 4)  outputs 3
        System.out.println(S.dequeue());        // contents: (9, 4)     outputs 7
        S.enqueue(6);                           // contents: (9, 4, 6)
        S.enqueue(8);                           // contents: (9, 4, 6, 8)
        System.out.println(S.dequeue());        // contents: (4, 6, 8)  outputs 9



        queue.enqueue(1);   // Queue: (1)
        queue.enqueue(2);   // Queue: (1, 2)
        queue.enqueue(3);   // Queue: (1, 2, 3)

        System.out.println("Before rotation: ");
        System.out.println("First element: " + queue.first());  // Output: 1

        queue.rotate();     // Rotate: Queue becomes (2, 3, 1)

        System.out.println("After first rotation: ");
        System.out.println("First element: " + queue.first());  // Output: 2

        queue.rotate();     // Rotate again: Queue becomes (3, 1, 2)

        System.out.println("After second rotation: ");
        System.out.println("First element: " + queue.first());  // Output: 3
    }

}
