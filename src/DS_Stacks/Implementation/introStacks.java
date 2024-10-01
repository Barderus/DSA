package DS_Stacks.Implementation;

import java.util.Stack;

public class introStacks{

    public static void main(String[] args) {

        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack + "\n");

        // Accessing elements of the stack:
        System.out.println("The element at the top of the stack: " + stack.peek());

        // Search for an element
        System.out.println("Search for value 15: " + stack.search(15));

        // Removing elements of the stack
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
