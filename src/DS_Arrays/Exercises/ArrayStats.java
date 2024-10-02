/*
    Array Statistics
Create a program that accepts an array of integers and calculates the following statistics:
    * Average value
    * Minimum value
    * Maximum value
 */
package DS_Arrays.Exercises;

import java.util.Arrays;
import java.util.Random;

public class ArrayStats {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[20];

        // generate random numbers and add it to the array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        // Initialize max, min, total value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;

        // Loop to traverse the array and sum all the values, find max, find min
        for (int i : arr) {
            total += i;
            // Find max
            if (i > max) {
                max = i;
            }
            // Find min
            if (i < min){
                min = i;
            }
        }

        int average = total / arr.length;

        // Display the result
        System.out.println("\nAverage: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
