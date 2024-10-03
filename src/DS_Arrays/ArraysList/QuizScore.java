/*
Build a program that takes an array of quiz scores and allows the user to:

Add a new score.
Remove the lowest score.
Calculate the average score and display it.
Display the list of scores.
 */
package DS_Arrays.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class QuizScore {

    public static Scanner scanner = new Scanner(System.in);


    public static ArrayList<Integer> addScore(ArrayList<Integer> array){
        String keepGoing = "";

        while(true){
            System.out.println("Enter Score: ");
            int score = scanner.nextInt();
            array.add(score);

            System.out.println("Would you like to add another score? (y/n)");
            keepGoing = scanner.next().toLowerCase();

            if("y".equals(keepGoing)){
                continue;
            } else {
                break;
            }
        }
        return array;
    }

    public static ArrayList<Integer> removeScore(ArrayList<Integer> array){
        int low = Integer.MAX_VALUE;

        for(int i = 0; i < array.size(); i++){
            if(low > i){
                low = i;
            }
        }
        System.out.println("Removing "+ low +"... ");
        array.remove(Integer.valueOf(low));
        return array;
    }

    public static void calcAvg(ArrayList<Integer> array) {
        int sum = 0;

        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        double average = (double) sum / array.size();
        System.out.println(average);
    }

    public static void displayList(ArrayList<Integer> array){
        System.out.println();
        for(int i = 0; i < array.size(); i++){
            System.out.println("Quiz " + i + " Score: " + array.get(i));
        }
    }

    public static int menu(){
        System.out.println("""
                \nWould you like to: \

                \t1. Add a new score\

                \t2. Remove score\

                \t3. Calculate Average\

                \t4. Display all scores\

                \t5. Exit""");

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        ArrayList<Integer> scoreList = new ArrayList<Integer>();

        while (true) {
            int userChoice = menu();

            if (userChoice == 1) {
                addScore(scoreList);
            } else if (userChoice == 2) {
                removeScore(scoreList);

            } else if (userChoice == 3) {
                calcAvg(scoreList);

            } else if (userChoice == 4) {
                displayList(scoreList);
            } else {
                System.exit(1);
            }
        }

    }
}
