/*
    Implement a simple shopping list application where users can:

Add items to a shopping list (use an array).
Remove an item by its index.
Display the current shopping list.
Check if a specific item is in the list.
 */
package DS_Arrays.ArraysList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryList {

    static Scanner scanner = new Scanner(System.in);


    public static ArrayList<String> addToList(ArrayList<String> array){

        return array;

    }

    public static void removeByIndex(ArrayList<String> array){

        System.out.println("Item removed");

    }

    public static void displayList(ArrayList<String> array){
        System.out.println("Shopping list");
        for(String item : array){
            System.out.println("Item 1: " + item);
        }
    }

    public static Boolean isInTheList(ArrayList<String> array, String targetItem){

        return true;
    }

    public static int menu() {

        int choice = 0;
        boolean sentinel = false;

        while (!sentinel) {

            try{
                System.out.println("""
                    \s
                    1. Add new item to the list \

                    2. Remove an item from the list\

                    3. Find item in the list\

                    4. Display list\

                    5. Exit""");
                choice = scanner.nextInt();

                // Check if the user choice is in the range
                if(choice > 0 && choice <= 5){
                    sentinel = true;
                }
                else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        return choice;
    }

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        boolean running = true;

        while(running){
            int userChoice = menu();

            switch (userChoice){
                case 1:
                    addToList(shoppingList);
                    break;
                case 2:
                    removeByIndex(shoppingList);
                    break;
                case 3:
                    System.out.println("What item would you like to see if it exists in the list? ");
                    String target = scanner.nextLine();

                    boolean isIn = isInTheList(shoppingList, target);
                    if(!isIn){
                        System.out.println("The item of choice is not in the list.");
                    }
                    else{
                        System.out.println(target + " is in the list.");
                    }
                case 4:
                    displayList(shoppingList);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option from the menu.");
                    break;
            }
        }
    }
}
