package org.example;

/**
 * Represents a student with a name and an ID.
 * Demonstrates the use of constructors, instance variables, and methods in Java.
 */
public class Stud {
    // Instance variables to store the name and ID of the student
    String name;
    int id;

    /**
     * Constructs a new student with the specified name and ID.
     *
     * @param name the name of the student
     * @param id   the ID of the student
     */
    public Stud(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Default constructor for the Stud class.
     * Initializes a student object without setting name and ID.
     */
    public Stud() {
    }

    /**
     * Prints a message indicating that the student is studying.
     * Includes the name of the student in the message.
     */
    public void Study() {
        System.out.println("This is study method of student " + this.name);
    }

    /**
     * The main method to demonstrate the creation and usage of Stud objects.
     * Creates two student objects and calls their Study method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create two student objects with specific names and IDs
        Stud s1 = new Stud("Tom", 12);
        Stud s2 = new Stud("Jerry", 24);

        // Call the Study method for each student
        s1.Study();
        s2.Study();
    }
}