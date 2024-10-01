package DS_Arrays.Implementation;

import java.util.Arrays;

public class searchEl {
    static int binarySearch(int[] arr, int target)
    {
        // In binary search, the array must be sorted.
        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == target)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < target)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 10, 15, 20, 25, 30};
        int target = 20;

        // Using linear search O(n) time complexity
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == target){
                System.out.println("Found it! " + target + " can be located on index " + i);
            }
        }

        // Binary Search O(log n)
        int searchedArr = binarySearch(myArray, target);
        System.out.println("Binary search: " + searchedArr);


    }
}
