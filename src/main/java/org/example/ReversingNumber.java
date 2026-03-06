package org.example;

public class ReversingNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;

        while(num != 0){
            int digit = num % 10; //1234 % 10 =4 //3
            reversed = reversed *10+digit; // 4 //40+3
            num = num/10;//123
        }

        System.out.println(reversed);
    }
}
