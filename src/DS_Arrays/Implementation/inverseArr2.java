package DS_Arrays.Implementation;

public class inverseArr2 {
    public static void main(String[] args) {

        // Generate a random array
        int[] myArr = new int[15];

        // Populate the array with random integer numbers
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = (int) (Math.random() * 100);
        }

        printArr(myArr);

        // Reverse array in place using pointers also O(n) but space is O(1)
        int startIndex = 0;
        int endIndex = myArr.length -1;

        while(startIndex < endIndex){
            int temp = myArr[startIndex];
            myArr[startIndex] = myArr[endIndex];
            myArr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        // Display the reversed array
        System.out.println();
        printArr(myArr);
    }

    public static void printArr(int[] myArr) {

        // Display the array
        System.out.print("Array: ");
        for (int i : myArr) {
            System.out.print(" " + i);
        }
    }
}
