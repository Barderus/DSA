package DS_LinkedList.Exercises;

public class findingNode {


    // Create the Node_imp class
    static class Node_imp {
        String data;
        Node_imp next;

        // Constructor
        Node_imp(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find the second-to-last Node_imp in the linked list
    public static Node_imp findSecondToLast(Node_imp head) {
        // If the list is empty or only has one Node_imp, there is no second-to-last Node_imp
        if (head == null || head.next == null) {
            return null;
        }

        Node_imp current = head;

        // Traverse the list until the second-to-last Node_imp is reached
        while (current.next.next != null) {
            current = current.next;
        }

        return current;
    }

    // Print the linked list
    public static void printList(Node_imp head) {
        Node_imp temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list
        Node_imp head = new Node_imp("H");
        head.next = new Node_imp("E");
        head.next.next = new Node_imp("L");
        head.next.next.next = new Node_imp("L");
        head.next.next.next.next = new Node_imp("O");
        head.next.next.next.next.next = new Node_imp(" ");
        head.next.next.next.next.next.next = new Node_imp("W");
        head.next.next.next.next.next.next.next = new Node_imp("O");
        head.next.next.next.next.next.next.next.next = new Node_imp("R");
        head.next.next.next.next.next.next.next.next.next = new Node_imp("L");
        head.next.next.next.next.next.next.next.next.next.next = new Node_imp("D");

        // Print the original linked list
        System.out.println("Display the linked list:");
        printList(head);

        // Find and print the second-to-last Node_imp
        Node_imp secondToLast = findSecondToLast(head);
        if (secondToLast != null) {
            System.out.println("The second-to-last Node_imp is: " + secondToLast.data);
        } else {
            System.out.println("The list is too short to have a second-to-last Node_imp.");
        }
    }
}
