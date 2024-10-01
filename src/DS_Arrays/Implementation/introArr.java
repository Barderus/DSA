package DS_Arrays.Implementation;

import java.util.Random;
import java.util.Scanner;

public class introArr {

    public static void main (String[]args){

        // Generate a hard-coded array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Generate a array with random elements
        int[] randomArr = new int[10];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 100);
        }

        // Displaying elements of the random array
        for (int j = 0; j < randomArr.length; j++) {
            System.out.println("Element " + j + ": " + randomArr[j]);
        }

        // Array methods
        int arrLength = myArray.length;
        System.out.println("Array Length: " + arrLength);

        // Summation of all the elements of the array
        int sumAll = 0;
        for (int i : myArray) {
            sumAll += i;
        }
        System.out.println("Total summation is: " + sumAll);

        // Find the largest element of an array
        int largest = 0;
        for (int i : randomArr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("The largest number in the random Array: " + largest);

        // Random shuffle the array

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Get from user the array size
        System.out.println("Enter the size of the array: ");
        int arrSize = scanner.nextInt();

        // Initialize the array
        int[] arrToShuffle = new int[arrSize];

        // Populate the array with random numbers
        for (int q = 0; q < arrToShuffle.length; q++) {
            arrToShuffle[q] += (int) (Math.random() * 100);
            System.out.print(arrToShuffle[q] + " ");
        }

        System.out.println();
        // Shuffle the array
        for (int p = arrToShuffle.length - 1; p > 0; p--) {
            int randomIndex = rand.nextInt(p + 1);
            int temp = arrToShuffle[p];
            arrToShuffle[p] = arrToShuffle[randomIndex];
            arrToShuffle[randomIndex] = temp;
            System.out.print(arrToShuffle[p] + " ");
        }
    }
}