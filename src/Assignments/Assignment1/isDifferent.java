package Assignments.Assignment1;

import java.util.Scanner;

public class isDifferent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a series of numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split the input string into an array of individual number strings
        String[] numbers = input.split("\\s+");

        // Flag if all numbers are distinct
        boolean allDistinct = true;

        // Outer loop iterates over each number in the array
        // Inner loop compares the current number with every other number
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].equals(numbers[j])) {
                    allDistinct = false;
                    break;
                }
            }
            // Break the loop if a duplicate is found
            if (!allDistinct) {
                break;
            }
        }

        if (allDistinct) {
            System.out.println("All numbers are distinct.");
        } else {
            System.out.println("There are duplicate numbers.");
        }

        scanner.close();
    }
}
