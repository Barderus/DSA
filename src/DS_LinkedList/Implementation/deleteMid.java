package DS_LinkedList.Implementation;

public class deleteMid {

    // Function to delete a Node_imp at a given position
    public static Node_imp deleteNode_imp(Node_imp head, int position)
    {
        Node_imp temp = head;
        Node_imp prev = null;

        // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 1) {
            head = temp.next;
            return head;
        }

        // Case 2: Node_imp to be deleted is in middle
        // Traverse till given position
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If given position is found, delete Node_imp
        if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }

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
        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node_imp head = new Node_imp(1);
        head.next = new Node_imp(2);
        head.next.next = new Node_imp(3);
        head.next.next.next = new Node_imp(4);
        head.next.next.next.next = new Node_imp(5);

        // Print original list
        System.out.print("Original list: ");
        printList(head);

        // Deleting Node_imp at position 2
        int position = 2;
        head = deleteNode_imp(head, position);

        // Print list after deletion
        System.out.print("List after deletion: ");
        printList(head);
    }
}
