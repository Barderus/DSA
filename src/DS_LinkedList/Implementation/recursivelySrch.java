package DS_LinkedList.Implementation;

public class recursivelySrch {
    
    // Checks whether the key is present in linked list
    static boolean searchKey(Node_imp head, int key) {

        // Base case
        if (head == null)
            return false;

        // If key is present in current Node_imp, return true
        if (head.data == key)
            return true;

        // Recur for remaining list
        return searchKey(head.next, key);
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 14 -> 21 -> 13 -> 30 -> 10
        Node_imp head = new Node_imp(14);
        head.next = new Node_imp(21);
        head.next.next = new Node_imp(13);
        head.next.next.next = new Node_imp(30);
        head.next.next.next.next = new Node_imp(10);

        // Key to search in the linked list
        int key = 14;

        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
