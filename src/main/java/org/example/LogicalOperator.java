package org.example;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        int c = 15;

        System.out.println(a<b && a<c);

        System.out.println(a>b || a>c);

        /*

        AND
        true and true = true
        true and false = false
        false and true = false
        false and false = false

        OR
        true or true = true
        true or false = true
        false or true = true
        false or false = false


        NOT
        !

        true -> false
        false -> true


         */

        System.out.println(a<b);
        System.out.println(!(a<b));
    }
}
