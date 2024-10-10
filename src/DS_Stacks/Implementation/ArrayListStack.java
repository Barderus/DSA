package DS_Stacks.Implementation;

import java.util.ArrayList;

public class ArrayListStack<T> {
    private ArrayList<T> stackList;

    // Constructor to initialize the stack
    public ArrayListStack() {
        stackList = new ArrayList<>();
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // Function to push an element onto the stack
    public void push(T value) {
        stackList.add(value);
    }

    // Function to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackList.remove(stackList.size() - 1);
    }

    // Function to get the top element of the stack without popping it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackList.get(stackList.size() - 1);
    }

    public static class Main {
        public static void main(String[] args) {
            ArrayListStack<Integer> stack = new ArrayListStack<>();
            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.peek()); // Outputs: 30
            System.out.println("Popped element: " + stack.pop()); // Outputs: 30
            System.out.println("Top element after pop: " + stack.peek()); // Outputs: 20
        }
    }
}
