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


    public static void addToList(ArrayList<String> array){

        System.out.println("Enter a new item for your shopping list: ");
        scanner.nextLine(); // Ensure no newline characters are left in the buffer
        String item = scanner.nextLine();

        array.add(item);
    }

    public static void removeByIndex(ArrayList<String> array, int target){

        System.out.println("Item removed");

    }

    public static void removeByName(ArrayList<String> array, String target){

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
                    System.out.println();
                    System.out.println("Would you like to remove the item by its index or name? (index / name) ");
                    String option = scanner.nextLine().toLowerCase();

                    if (option.equals("index")) {
                        System.out.println("Enter the index to be removed: ");
                        int index = scanner.nextInt();

                        // Clear the buffer after nextInt()
                        scanner.nextLine();

                        // Validate the index (it should be in the range of 0 to size-1)
                        if (index < 0 || index >= shoppingList.size()) {
                            System.out.println("Invalid index. The list has " + shoppingList.size() + " items.");
                        } else {
                            removeByIndex(shoppingList, index);
                        }
                    } else if (option.equals("name")) {
                        System.out.println("Enter the name of the item: ");
                        String itemName = scanner.nextLine();

                        // Check if the item exists in the list
                        if (shoppingList.contains(itemName)) {
                            removeByName(shoppingList, itemName);
                        } else {
                            System.out.println("The item " + itemName + " is not in the list.");
                        }
                    } else {
                        System.out.println("Invalid option. Please choose 'index' or 'name'.");
                    }
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
