package org.example;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {7,4,1,3,5,9,3,6};
        int temp = 0;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] < arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //largest number
        System.out.println(arr[arr.length-1]);
        //smallest number
        System.out.println(arr[0]);

        //2nd / 3rd largest number //arr[arr.length-n]
        System.out.println(arr[arr.length-3]);
        //2nd smallest //arr[n-1]
        System.out.println(arr[2-1]);
    }
}
 /*
Sum of array
Min and Max
Compare 2 arrays
Reverse the array

  */