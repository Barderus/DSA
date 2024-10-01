package DS_LinkedList.Implementation;

public class insertEnd {
    // Function appends a new Node_imp_imp at the end and returns
    // the head.
    static Node_imp insertAtEnd(Node_imp head, int newData)
    {

        // Create a new Node_imp
        Node_imp newNode_imp = new Node_imp(newData);

        // If the Linked List is empty, make the new
        // Node_imp as the head and return
        if (head == null) {
            return newNode_imp;
        }

        // Store the head reference in a temporary variable
        Node_imp last = head;

        // Traverse till the last Node_imp
        while (last.next != null) {
            last = last.next;
        }

        // Change the next pointer of the
        // last Node_imp to point to the new Node_imp
        last.next = newNode_imp;

        // Return the head of the list
        return head;
    }

    public static void printList(Node_imp Node_imp)
    {
        while (Node_imp != null) {
            System.out.print(" " + Node_imp.data);
            Node_imp = Node_imp.next;
        }
    }

    public static void main(String[] args)
    {
        // Create a linked list:
        // 2 -> 3 -> 4 -> 5 -> 6
        Node_imp head = new Node_imp(2);
        head.next = new Node_imp(3);
        head.next.next = new Node_imp(4);
        head.next.next.next = new Node_imp(5);
        head.next.next.next.next = new Node_imp(6);

        System.out.print("Created Linked list is:");
        printList(head);

        // Example of appending a Node_imp at the end
        head = insertAtEnd(head, 1);

        System.out.print("\nAfter inserting 1 at the end:");
        printList(head);
    }
}
