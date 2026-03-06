package org.example;

public class ForLoop {
    public static void main(String[] args) {

        //start- init; stop- condition; step- increment
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        for(int i = 10; i>-100; i--){
            System.out.println(i);
        }
        System.out.println("**");
        for (int i = 3; i < 90; i=i+3) {
            System.out.println(i);
            if(i == 45){
                break;
            }

        }
    }
}
