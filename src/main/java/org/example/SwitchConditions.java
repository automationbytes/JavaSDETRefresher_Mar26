package org.example;

import java.util.Scanner;

public class SwitchConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter week day value (1-7):");
        int weekday = scanner.nextInt();

        switch (weekday){
            case 1: //weekday == 1
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Selection");


        }

    /*

    marklist - a+b+c => avg

    avg 90+ A
    89-70 - B
    69-50- C
    less than 50 - F


    Month -1

     */

    }
}
