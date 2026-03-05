package org.example;

import java.util.Scanner;

public class ifElseCond {
    public static void main(String[] args) {
//        int a = 750;
//        int b = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = scanner.nextInt();
        System.out.println("Enter B value:");
        int b = scanner.nextInt();
        if(a < b){
            System.out.println("A is lesser than B");
        } else if (b < a) {
            System.out.println("B is lesser than A");
        }else {
            System.out.println("A and B are equal");
        }

        /*
        1) Positive or Negative Numbers
        2) Odd or Even
        3) Leap Year



         */

    }
}
