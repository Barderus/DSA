/*

Implement a simple contact manager where users can:

    * Add contact names to an array.
    * Search for a contact by name.
    * Display all contacts in the array.
 */
package DS_Arrays.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    static Scanner scanner = new Scanner(System.in);


    public static void addContacts(ArrayList<ArrayList<String>> contactManager) {
        final int MAX_SIZE = 10;

        // Prompt for the contact's name
        System.out.println("Enter contact's name: ");
        String name = scanner.nextLine();

        while (true) {
            // Prompt for the contact's phone number
            System.out.println("Enter contact's number: ");
            String phoneNumber = scanner.nextLine();

            // Validate phone number length
            if (phoneNumber.length() > MAX_SIZE) {
                System.out.println("Phone number must be less than or equal to " + MAX_SIZE + " digits. Please try again.");
            } else {
                contactManager.get(0).add(name);
                contactManager.get(1).add(phoneNumber);

                System.out.println("New contact added to your contact manager.");
                break;
            }
        }
    }

    public static void removeContacts(ArrayList<ArrayList<String>> contactManager){
        System.out.println("Enter the name of the contact to be removed: ");
        String target = scanner.nextLine().trim();

        if (contactManager.get(0).contains(target)) {
            int index = contactManager.get(0).indexOf(target);

            // Remove contact from both lists
            contactManager.get(0).remove(index);
            contactManager.get(1).remove(index);

            System.out.println(target + " was removed successfully.");
        } else {
            System.out.println("Contact does not exist.");
        }
    }

    public static void searchContact(ArrayList<ArrayList<String>> contactManager){

        System.out.println("Enter the name of the contact to be searched: ");
        String target = scanner.nextLine().trim();

        if(contactManager.get(0).contains(target)){

            int index = contactManager.get(0).lastIndexOf(target);
            System.out.println("Name: " + contactManager.get(0).get(index));
            System.out.println("Phone number: " + contactManager.get(1).get(index));
        }
    }

    public static void displayContacts(ArrayList<ArrayList<String>> contactManager){    // Iterate over both lists using an index
        for (int i = 0; i < contactManager.get(0).size(); i++) {
            System.out.println("Name: " + contactManager.get(0).get(i) + "\tPhone Number: " + contactManager.get(1).get(i));
        }
    }

    public static int menu(){
        int choice = 0;
        while (true){
            System.out.println("""
                    \s
                    \t1. Add a contact\
                    \s
                    \t2. Remove a contact\
                    \s
                    \t3. Search for a contact\
                    \s
                    \t4. Display all contacts \
                    \s
                    \t5. Exit\s""");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5){
                break;
            }
            else{
                System.out.println("You must enter a number between 1 and 5.");
            }
        }
        return choice;
    }

    public static void main(String[] args) {

        boolean running = true;

        ArrayList<ArrayList<String>> contactManager = new ArrayList<>();
        contactManager.add(new ArrayList<>()); // List for names
        contactManager.add(new ArrayList<>()); // List for phone numbers        boolean running = true;

        while (running) {
            int userChoice = menu();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    addContacts(contactManager);
                    break;
                case 2:
                    removeContacts(contactManager);
                    break;
                case 3:
                    searchContact(contactManager);
                    break;
                case 4:
                    displayContacts(contactManager);
                    break;
                case 5:
                    running = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }


    }
}
