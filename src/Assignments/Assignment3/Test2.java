package Assignments.Assignment3;

import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        // Create an initially empty stack
        Stack<Integer> stack = new Stack<>();

        // Simulate 25 push operations
        for (int i = 1; i <= 25; i++) {
            stack.push(i);  // Push an integer (can be any value, just simulating)
        }

        // Simulate 12 top operations (which don't change the stack size)
        for (int i = 1; i <= 12; i++) {
            if (!stack.isEmpty()) {
                stack.peek();  // Just view the top of the stack without popping
            }
        }

        // Simulate 10 pop operations, 3 of which return null (i.e., stack is empty)
        int popAttempts = 10;
        int nullPops = 0;  // To track how many times we try to pop from an empty stack

        for (int i = 1; i <= popAttempts; i++) {
            if (!stack.isEmpty()) {
                stack.pop();  // Pop element if the stack is not empty
            } else {
                nullPops++;  // Count how many null pops occurred
                System.out.println("Pop operation returned null because stack was empty.");
            }
        }

        // Display the final size of the stack
        System.out.println("Final size of the stack: " + stack.size());
        System.out.println("Number of null pops (empty stack): " + nullPops);
    }
}
