package DS_Stacks.Implementation;

class stackImplement {

        // Store elements of stack
        private int[] arr;

        // Represent top of stack
        private int top;

        // Total capacity of the stack
        private int capacity;

        // Creating a stack
        stackImplement(int size) {
            // Initialize the array
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push elements to the top of stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");

                // Terminates the program
                System.exit(1);
            }

            // Insert element on top of the stack
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }

        public int pop() {
            // If stack is empty
            if (isEmpty()) {
                System.out.println("Empty Stack");

                // Terminate the program
                System.exit(1);
            }

            // Pop the element from top of stack
            return arr[top--];
        }

        // Return size of the stack
        public int getSize() {
            return top + 1;
        }

        // Check if the stack is empty
        public Boolean isEmpty() {
            return top == -1;
        }

        // Check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;

        }

        // Display elements of stack
        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i] + " ");
            }
        }

        public static void main(String[] args) {
            stackImplement stack = new stackImplement(10);

            // Adding elements to the stack
            stack.push(1);
            stack.push(3);
            stack.push(5);

            System.out.println("Stack: ");
            stack.printStack();

            // Remove elements from stack
            stack.pop();

            System.out.println("After popping out");
            stack.printStack();
        }
    }
