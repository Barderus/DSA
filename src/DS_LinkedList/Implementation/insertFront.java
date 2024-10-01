package DS_LinkedList.Implementation;

public class insertFront {
    // Function to insert a new Node_imp at the beginning of the
    // list
    public static Node_imp insertAtFront(Node_imp head,
                                     int new_data) {
        // Create a new Node_imp with the given data
        Node_imp new_Node_imp = new Node_imp(new_data);

        // Make the next of the new Node_imp point to the
        // current head
        new_Node_imp.next = head;

        // Return the new Node_imp as the new head of the list
        return new_Node_imp;
    }

    public static void printList(Node_imp head) {
        Node_imp curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list 2->3->4->5
        Node_imp head = new Node_imp(2);
        head.next = new Node_imp(3);
        head.next.next = new Node_imp(4);
        head.next.next.next = new Node_imp(5);

        // Print the original list
        System.out.println("Original Linked List:");
        printList(head);

        // Insert a new Node_imp at the front of the list
        System.out.println(
                "After inserting Node at the front:");
        int data = 1;
        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}
