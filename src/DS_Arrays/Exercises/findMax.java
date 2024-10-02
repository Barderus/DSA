package DS_Arrays.Exercises;

import java.util.Arrays;
import java.util.Random;

public class findMax {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[20];
        int max = Integer.MIN_VALUE;

        // generate random numbers and add it to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        // If the num is bigger max, than it becomes max, otherwise it keeps going
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The max number in this array is " + max);
    }
}
