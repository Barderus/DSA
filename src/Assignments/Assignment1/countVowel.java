package Assignments.Assignment1;

import java.util.Scanner;

public class countVowel {

    public static void main(String[] args) {

        // Import the scanner class
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a string: ");
        String input = scanner.next();

        // Get input length
        int inputSize = input.length();
        int vowelsAmnt = 0;

        // Loop that checks if each char contains one of the vowels (a, e, i, o, u)
        for(int i = 0; i < inputSize; i++) {
            if(input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u'
                    || input.charAt(i) == 'y') {
                vowelsAmnt++;
            }
        }
        System.out.print("Number of vowels: ");
        System.out.println(vowelsAmnt);

        scanner.close();



    }
}
