/*
Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive, one
of which is repeated. Describe an algorithm for finding the integer in A that is
repeated.
 */

package DS_Arrays.Exercises;

public class repeatedN {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 9, 3, 4, 5, 6, 7, 9};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println("Found it! " + myArray[i] + " is a repeated element");
                }
            }
        }
    }
}
