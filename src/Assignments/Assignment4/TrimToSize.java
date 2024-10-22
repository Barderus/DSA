package Assignments.Assignment4;

import java.util.ArrayList;
public class TrimToSize {

    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>(10);

        System.out.println();
        elements.add("Apple");
        elements.add("Banana");
        elements.add("Cherry");
        elements.add("Date");

        // Call the custom trimToExactSize method
        trimToExactSize(elements);

        System.out.println("After trimming: Size = " + elements.size());
        System.out.println("Elements: " + elements);
    }

    public static void trimToExactSize(ArrayList<String> list) {
        list.trimToSize();
        System.out.println("\nArrayList trimmed to exact size.");
    }
}
