package DS_Arrays.Exercises;

import java.util.Arrays;
import java.util.Random;

public class checkRepetition {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[20];

        // generate random numbers and add it to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int num = 1; num < arr.length; num++){
            if(arr[num] == arr[num-1]){
                System.out.println("Found the duplicate!");
                System.out.println(arr[num] + " = " + arr[num-1]);
            }
        }


    }
}
