package org.example;

import java.io.FileReader;

public class Exceptions_Eg {
    public static void main(String[] args) {
        //unchecked exception
        int[] arr = {1,2,3};
       // System.out.println(arr[5]);

        int i = 11;
        System.out.println(i/0);

            //checked exception - Compile time exception
//        Thread.sleep(1000);
//
//        FileReader fileReader = new FileReader("nonexistentfile.txt");
//        fileReader.read();

    }

}
