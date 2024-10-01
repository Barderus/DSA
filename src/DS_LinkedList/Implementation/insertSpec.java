package DS_LinkedList.Implementation;

public class insertSpec {

    // Function to insert a Node_imp at a specific position in
    // the linked list
    public static Node_imp
    insertAtPosition(Node_imp head, int position, int data)
    {
        Node_imp newNode_imp = new Node_imp(data);

        // If inserting at the beginning
        if (position == 1) {
            newNode_imp.next = head;
            head = newNode_imp;
            return head;
        }

        Node_imp current = head;
        for (int i = 1; i < position - 1 && current != null;
             ++i) {
            current = current.next;
        }

        // If the position is out of bounds
        if (current == null) {
            System.out.println(
                    "Position is out of bounds.");
            return head;
        }

        newNode_imp.next = current.next;
        current.next = newNode_imp;
        return head;
    }

    public static void printList(Node_imp head)
    {
        while (head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Creating the list 3->5->8->10
        Node_imp head = new Node_imp(3);
        head.next = new Node_imp(5);
        head.next.next = new Node_imp(8);
        head.next.next.next = new Node_imp(10);

        System.out.print("Linked list before insertion:");
        printList(head);

        // Insert a new Node_imp with data 12 at position 3
        int data = 12, pos = 2;
        head = insertAtPosition(head, pos, data);
        System.out.print("Linked list after insertion of 12 at position " + pos + ":");
        printList(head);
    }
}
