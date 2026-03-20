package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws_Eg {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader("12.txt"); //open
        fileReader.read(); //reading
        System.out.println("File read successfully");

    }
}
