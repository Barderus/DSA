package Assignments.Assignment1;

import java.util.Scanner;

public class isEven {

    public class IsEven {

        // Function to check if a number is even
        static boolean even(int k) {
            // Initialize flag as true since 0 is even
            boolean flag = true;

            // This loop alternates flag between true and false for each iteration
            for (int i = 1; i <= k; i++) {
                if (flag) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
            return flag;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.println("Enter an integer value: ");
            int input = scanner.nextInt();

            // Call the even function and store the returned value
            boolean var = even(input);

            // Personalized output if the input is even or odd
            if (var) {
                System.out.println(input + " is an even number!");
            } else {
                System.out.println(input + " is an odd number!");
            }
            scanner.close();

        }
    }
}
