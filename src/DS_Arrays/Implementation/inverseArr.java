package DS_Arrays.Implementation;

public class inverseArr {

    public static void main(String[] args) {

        // Generate a random array
        int[] myArr = new int[15];

        // Populate the array with random integer numbers
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = (int) (Math.random() * 100);
        }
        // Display the array
        printArr(myArr);


        int[] reversedArr = new int[myArr.length];
        // Reverse the array - O(n)
        for(int j = 0; j < myArr.length; j++){
            reversedArr[j] = myArr[myArr.length - j - 1];
        }

        //Display the reversed Array
        System.out.println();
        printArr(reversedArr);

    }

    public static void printArr(int[] myArr) {

        // Display the array
        System.out.print("Array: ");
        for (int i : myArr) {
            System.out.print(" " + i);
        }
    }
}
