package Assignments.Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeyondBoundary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = new ArrayList<>();

        for(int n = 1; n <= 10; n++){
            elements.add(n);
        }

        System.out.println("What element would you like to see? ");
        int index = scanner.nextInt()-1;
        try {
            System.out.println(elements.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
