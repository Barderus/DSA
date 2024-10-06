/*
 * Author: Gabriel dos Reis
 * Date: 9/2/2024
 * Program: Maryland.java
 * Purpose: To show the output (shown below) what script do you need to add in the above code?
 *		Read it.
 *		Ship it.
 *		Buy it.
 *		Read it.
 *		Box it.
 *		Read it.
 */

package Assignments.Assignment1;

public class Maryland extends State {
    Maryland() { /* null constructor */ }
    public void printMe() {
        System.out.println("Read it.");
    }
    public static void main(String[] args) {
        Region east = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();

        md.printMe();
        east.printMe();
        ((Place) obj).printMe(); // Casting Place to obj
        md.printMe();
        usa.printMe();
        md.printMe();

    }
}
class State extends Region {
    State() { /* null constructor */ }
    public void printMe() {
        System.out.println("Ship it.");
    }
}

class Region extends Place {
    Region() { /* null constructor */ }
    public void printMe() {
        System.out.println("Box it.");
    }
}

class Place extends Object {
    Place() { /* null constructor */

    }
    public void printMe() {
        System.out.println("Buy it.");
    }
}

