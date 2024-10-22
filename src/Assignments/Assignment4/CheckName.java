package Assignments.Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        names.add("Lena");
        names.add("Nicholas");
        names.add("Aruna");
        names.add("Anthony");
        names.add("Daniel");
        names.add("Thomas");

        System.out.println("Enter a name: ");
        String inputName = scanner.nextLine();

        if(names.contains(inputName)){
            System.out.println(inputName + " exists in the ArrayList.");
        }
        else{
            System.out.println(inputName + " does not exist in the ArrayList.");
        }

        scanner.close();
    }
}
