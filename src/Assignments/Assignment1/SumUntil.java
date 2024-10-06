package Assignments.Assignment1;

import java.util.Scanner;

public class SumUntil {

        static void sumTil(int n) {

            // Initialize the sum variable to hold the sum of all the squares of the integers
            int sum = 0;

            // Loop that iterates until n-1 and adds the power of i to the sum
            for (int i = 1; i < n; i++) {
                sum += Math.pow(i, 2);
            }
            // Display the total sum
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the user Input for the integer value
            System.out.println("Enter an integer value: ");
            int input = scanner.nextInt();

            // call the function
            sumTil(input);
            scanner.close();
        }
}
