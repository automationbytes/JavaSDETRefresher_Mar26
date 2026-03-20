package org.example;

import java.io.FileReader;

public class Try_Catch_InsteadofThrows {
    public static void main(String[] args) {
        try{
        FileReader fileReader = new FileReader("1.txt"); //open
        fileReader.read(); //reading
        System.out.println("File read successfully");
        }catch(Exception e) {
            System.out.println("File read failed");
        }
    }
}
