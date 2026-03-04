package org.example;

public class BitwiseOperator {
    public static void main(String[] args) {

//        int a = 9; //1001
//        int b = 5; //0101

        int a = 5; //0101
        int b = 8;//1000
        /*
        1 and 1 = 1
        1 and 0 = 0
        0 and 1 = 0
        0 and 0 = 0

         */

        System.out.println(a & b); //0001

        System.out.println(a | b); //1101 (8+4+0+1)
    }
}
