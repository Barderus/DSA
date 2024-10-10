package DS_Arrays.ArraysList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryList {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Adds a new item to the shopping list.
     * If the item is already in the list, it doesn't add it again.
     * @param array the shopping list where the item will be added
     */
    public static void addToList(ArrayList<String> array) {
        System.out.println("Enter a new item for your shopping list: ");
        scanner.nextLine();  // Clear the buffer after any previous input

        String item = scanner.nextLine();

        if (array.contains(item)) {
            System.out.println(item + " is already in your shopping list.");
        } else {
            array.add(item);
            System.out.println(item + " has been added to your shopping list.");
        }
    }

    /**
     * Removes an item from the shopping list by its index.
     * No index validation is done here (handled externally).
     * @param array the shopping list from which the item will be removed
     * @param target the index of the item to remove
     */
    public static void removeByIndex(ArrayList<String> array, int target) {
        array.remove(target);
    }

    /**
     * Removes an item from the shopping list by its name (case-insensitive).
     * @param array the shopping list from which the item will be removed
     * @param target the name of the item to remove
     */
    public static void removeByName(ArrayList<String> array, String target) {
        array.removeIf(item -> item.equalsIgnoreCase(target));  // Case-insensitive removal
    }

    /**
     * Displays the current shopping list.
     * If the list is empty, it informs the user.
     * @param array the shopping list to display
     */
    public static void displayList(ArrayList<String> array) {
        if (array.isEmpty()) {
            System.out.println("Your shopping list is empty.");
        } else {
            System.out.println("Shopping list:");
            for (int i = 0; i < array.size(); i++) {
                System.out.println("Item " + (i + 1) + ": " + array.get(i));  // Dynamically number items
            }
        }
    }

    /**
     * Checks if a specific item is in the shopping list.
     * @param array the shopping list to search
     * @param targetItem the name of the item to search for
     * @return true if the item is found, false otherwise
     */
    public static Boolean isInTheList(ArrayList<String> array, String targetItem) {
        return array.contains(targetItem);
    }

    /**
     * Displays the menu and ensures a valid selection is made.
     * @return the user's choice of action as an integer (1-5)
     */
    public static int menu() {

        int choice = 0;
        boolean sentinel = false;

        while (!sentinel) {
            try {
                // Display menu options
                System.out.println("""
                    \s
                    1. Add new item to the list \

                    2. Remove an item from the list\

                    3. Find item in the list\

                    4. Display list\

                    5. Exit""");
                choice = scanner.nextInt();

                // Check if the user choice is in the valid range
                if (choice > 0 && choice <= 5) {
                    sentinel = true;
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                // Handle invalid input by prompting the user again
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();  // Clear invalid input
            }
        }
        return choice;
    }

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        boolean running = true;

        while (running) {
            int userChoice = menu();  // Display menu and get user's choice

            switch (userChoice) {
                case 1:
                    addToList(shoppingList);  // Add item to the list
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Would you like to remove the item by its index or name? (index / name) ");
                    String option = scanner.nextLine().toLowerCase();

                    if (option.equals("index")) {
                        System.out.println("Enter the index to be removed: ");
                        int index = scanner.nextInt();

                        scanner.nextLine();  // Clear the buffer after nextInt()

                        // Validate the index (it should be in the range of 0 to size-1)
                        if (index < 0 || index >= shoppingList.size()) {
                            System.out.println("Invalid index. The list has " + shoppingList.size() + " items.");
                        } else {
                            removeByIndex(shoppingList, index);  // Remove by index
                        }
                    } else if (option.equals("name")) {
                        System.out.println("Enter the name of the item: ");
                        String itemName = scanner.nextLine();

                        // Check if the item exists in the list
                        if (shoppingList.contains(itemName)) {
                            removeByName(shoppingList, itemName);  // Remove by name
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
                    if (!isIn) {
                        System.out.println("The item of choice is not in the list.");
                    } else {
                        System.out.println(target + " is in the list.");
                    }
                    break;
                case 4:
                    displayList(shoppingList);  // Display the current shopping list
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    running = false;  // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option from the menu.");
                    break;
            }
        }
    }
}
