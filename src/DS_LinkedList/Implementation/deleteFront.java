package DS_LinkedList.Implementation;

public class deleteFront {

    // Function to delete the head Node_imp
    public static Node_imp deleteHead(Node_imp head)
    {
        // Base case if linked list is empty
        if (head == null)
            return null;

        // Change the head pointer to the next Node_imp
        // and free the original head
        Node_imp temp = head;
        head = head.next;

        // Free the original head (handled by garbage
        // collector)
        temp = null;

        // Return the new head
        return head;
    }

    public static void printList(Node_imp head)
    {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        // Creating a linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node_imp head = new Node_imp(1);
        head.next = new Node_imp(2);
        head.next.next = new Node_imp(3);
        head.next.next.next = new Node_imp(4);
        head.next.next.next.next = new Node_imp(5);

        System.out.println("Original list: ");
        printList(head);
        // Deleting the head Node_imp
        head = deleteHead(head);
        System.out.println(
                "List after deleting the head: ");
        printList(head);
    }
}
