package DS_LinkedList.Implementation;

public class insertGiven {

    // Function to insert a new Node_imp after a given Node_imp
    public static Node_imp insertAfter(Node_imp head, int key,
                                   int newData)
    {
        Node_imp curr = head;

        // Iterate over Linked List to find the key
        while (curr != null) {
            if (curr.data == key)
                break;
            curr = curr.next;
        }

        // if curr becomes null means, given key is not
        // found in linked list
        if (curr == null)
            return head;

        // Allocate new Node_imp by given data and point
        // the next of newNode_imp to curr's next &
        // point current next to newNode_imp
        Node_imp newNode_imp = new Node_imp(newData);
        newNode_imp.next = curr.next;
        curr.next = newNode_imp;
        return head;
    }

    public static void printList(Node_imp Node_imp)
    {
        while (Node_imp != null) {
            System.out.print(Node_imp.data + " ");
            Node_imp = Node_imp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Create the linked list 2->3->5->6
        Node_imp head = new Node_imp(2);
        head.next = new Node_imp(3);
        head.next.next = new Node_imp(5);
        head.next.next.next = new Node_imp(6);

        System.out.println("Original Linked List: ");
        printList(head);

        // Key: Insert Node_imp after key
        int key = 3;
        int newData = 4;

        // Insert a new Node_imp with data 4 after the Node_imp
        // having data 3
        head = insertAfter(head, key, newData);

        System.out.println("Linked List after insertion: ");
        printList(head);
    }
}
