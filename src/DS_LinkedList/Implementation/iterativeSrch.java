package DS_LinkedList.Implementation;

public class iterativeSrch {
    // Checks whether key is present in linked list
    static boolean searchKey(Node_imp head, int key) {

        // Initialize curr with the head of linked list
        Node_imp curr = head;

        // Iterate over all the Node_imps
        while (curr != null) {

            // If the current Node_imp's value is equal to key,
            // return true
            if (curr.data == key)
                return true;

            // Move to the next Node_imp
            curr = curr.next;
        }

        // If there is no Node_imp with value as key, return
        // false
        return false;
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 14 -> 21 -> 13 -> 30 -> 10
        Node_imp head = new Node_imp(30);
        head.next = new Node_imp(21);
        head.next.next = new Node_imp(13);
        head.next.next.next = new Node_imp(14);
        head.next.next.next.next = new Node_imp(10);

        // Key to search in the linked list
        int key = 14;

        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
