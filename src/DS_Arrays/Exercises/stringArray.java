/*
String Array Manipulation
Write a program that takes an array of strings and provides the following functionalities:

    * Sort the strings alphabetically.
    * Find the longest and shortest strings.
    * Count the number of strings that contain a specific character (ask the user for the character).
 */
package DS_Arrays.Exercises;

import java.util.Arrays;

public class stringArray {

    public static void main(String[] args) {

        String[] arr = {"Gabriel", "Fiona", "Henry", "David", "Ollie", "Livy", "Kristy", "Matthew"};

        // Sort the string alphabetically
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Find the longest and shortest string
        int short_string = Integer.MAX_VALUE;
        int long_string = Integer.MIN_VALUE;
        String short_index = "";
        String long_index = "";

        for (String s : arr) {
            if (long_string < s.length()) {
                long_string = s.length();
                long_index = s;
            }
            if (short_string > s.length()) {
                short_string = s.length();
                short_index = s;
            }

        }

        System.out.println(long_index + " has " + long_string + " characters");
        System.out.println(short_index + " has " + short_string + " characters");

    }
}
