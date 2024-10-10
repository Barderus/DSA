/*
    Use a stack to reverse a given string. Push each character onto the stack,
    then pop them off to build the reversed string.
 */
package DS_Stacks.Exercises;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();


        System.out.println("Enter a word to be reversed: ");
        String s = scanner.nextLine().strip();

        // Push each character onto the stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        // Pop each character from the stack to form the reversed string
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());  // Concatenating directly
        }

        System.out.println("Reversed word: " + reversedString);
    }
}

