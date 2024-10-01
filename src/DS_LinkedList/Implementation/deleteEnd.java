package DS_LinkedList.Implementation;

public class deleteEnd {

    // Function to remove the last Node_imp of the linked list
    public static Node_imp removeLastNode_imp(Node_imp head)
    {

        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // If the list has only one Node_imp, delete it and
        // return null
        if (head.next == null) {
            return null;
        }

        // Find the second last Node_imp
        Node_imp secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last Node_imp
        secondLast.next = null;

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

        System.out.println("Original list: ");
        printList(head);

        // Removing the last Node_imp
        head = removeLastNode_imp(head);

        System.out.println(
                "List after removing the last Node: ");
        printList(head);
    }
}
