package org.example;

import java.util.Arrays;

public class Array_Eg {
    public static void main(String[] args) {
        /*
        Array refers to data structure
        In Array - Store multiple values in a single variable
        Array to store single/same datatype - In general
        Array are fixed in size
        Array can contains duplicate values
        Array can be accessed by its index
        Index number will always starts with 0 -arr[0]

         */

        //1st way
        int[] arr = new int[5]; //5 values in this array
        //
        int arr1[] = new int[5];

        arr[0] = 1;//1
        arr[1] = 5; //2
        arr[2] = 3;//3
        arr[3] = 4;//4
        arr[4] = 4;//5

        System.out.println(Arrays.toString(arr));
//        arr[5] = 5;
//
//        System.out.println(Arrays.toString(arr));

        //2nd way
        int[] b = {1,6,9,7,3,4,4};
        System.out.println(Arrays.toString(b));

        //length of array
        System.out.println(b.length);

        //for loop
        for (int i = 0; i < b.length; i++) {
            System.out.println(i+"-> "+b[i]);
        }
        //for each
        for(int x : b){
            System.out.println(x);
        }
    }
}
