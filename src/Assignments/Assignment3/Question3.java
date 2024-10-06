package Assignments.Assignment3;

import java.util.Stack;

public class Question3 {
    // Method to transfer elements from stack S to stack T
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            E element = S.pop();  // Pop from S
            T.push(element);      // Push onto T
        }
    }

    public static void main(String[] args) {
        // Create two stacks, S and T
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        // Push elements onto stack S
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);

        // Display contents of stack S before transfer
        System.out.println("Stack S before transfer: " + S);
        System.out.println("Stack T before transfer: " + T);

        // Call the transfer method
        transfer(S, T);

        // Display contents of stack S and stack T after transfer
        System.out.println("Stack S after transfer: " + S);
        System.out.println("Stack T after transfer: " + T);
    }
}

