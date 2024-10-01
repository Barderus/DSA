/*
Let B be an array of size n ≥ 6 containing integers from 1 to n−5 inclusive, five
of which are repeated. Describe an algorithm for finding the five integers in B
that are repeated.
 */

package DS_Arrays.Exercises;

public class repeatedFive {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 1, 4, 1, 5, 1, 6, 1, 7, 8, 9};
        int count = 0;

        for(int i = 0; i < myArray.length; i++){
            for(int j = i + 1; j < myArray.length; j++){
                if(myArray[i] == myArray[j]) {
                    count += 1;
                }
                else if (count == 5) {
                    System.out.println("Found it! " + myArray[i] + " repeats 5 times!");
                }
            }
        }
    }
}
