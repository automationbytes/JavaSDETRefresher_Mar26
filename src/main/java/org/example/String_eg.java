package org.example;

import java.util.Arrays;

/**
 * Demonstrates various operations and methods available in the String class in Java.
 * Covers topics such as string creation, comparison, manipulation, and utility methods.
 */
public class String_eg {
    public static void main(String[] args) {
        /*
         * String - used to store more than one character.
         * Strings are enclosed in double quotes ("").
         *
         * Two ways to create strings:
         * 1. Literal way - Stored in String Pool Memory.
         * 2. Using the new keyword - Stored in Heap Memory.
         */

        // Literal way: Strings are stored in shared memory (String Pool).
        String a = "hello"; // shared memory
        String c = "Hello"; // shared memory

        // New keyword way: Strings are stored in heap memory.
        String b = new String("hello"); // separate memory allocation

        // Comparing strings using == and .equals
        System.out.println(a == b); // Compares memory references
        System.out.println(a == c); // Compares memory references

        // .equals method: Compares the content of the strings
        System.out.println(a.equals(b)); // Content comparison
        System.out.println(a.equals(c)); // Content comparison

        // .equalsIgnoreCase: Compares content ignoring case
        System.out.println(a.equalsIgnoreCase(c));

        // Check if the string starts with a specific prefix
        System.out.println(a.startsWith("He"));

        // Check if the string ends with a specific suffix
        System.out.println(a.endsWith("o"));

        // Check if the string contains a specific sequence
        System.out.println(a.contains("ll"));

        // Get the character at a specific index
        System.out.println(a.charAt(2)); // Index starts from 0

        // Get the index of the first occurrence of a character
        System.out.println(a.indexOf("l"));

        // Get the index of the last occurrence of a character
        System.out.println(a.lastIndexOf("l"));

        // Concatenate two strings
        String i = "ice";
        String j = "juice";
        System.out.println(i.concat(j)); // Using concat method
        System.out.println(i + j); // Using + operator

        // Replace characters in a string
        String k = "kalpana is a sweet girl";
        System.out.println(k.replace("a", "0"));

        // Split a string into an array based on a delimiter
        String[] words = k.split(" ");
        System.out.println(Arrays.toString(words));

        // Remove leading and trailing spaces
        String l = "     love my country     ";
        System.out.println(l.trim()); // Removes leading and trailing spaces

        // Strip leading and trailing spaces (alternative to trim)
        System.out.println(l.strip());

        // Remove only leading spaces
        System.out.println(l.stripLeading());

        // Remove only trailing spaces
        System.out.println(l.stripTrailing());

        // Convert string to uppercase
        System.out.println(l.toUpperCase());

        // Convert string to lowercase
        System.out.println(l.toLowerCase());

        // Extract a substring from a string
        String appli = "Application id is: 4997976";
        System.out.println(appli.substring(19, 26)); // Extracts "4997976"

        // Split a string into parts based on a delimiter
        String[] sp = appli.split(": ");
        System.out.println(sp[0]); // First part
        System.out.println(sp[1]); // Second part

        // Convert a string to a character array
        String m = "mahath";
        char[] arr = m.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}