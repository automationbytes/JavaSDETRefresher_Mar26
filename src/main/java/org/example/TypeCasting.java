package org.example;

public class TypeCasting {
    public static void main(String[] args) {

/*
Typecasting - changing from one datatype to another

Widening casting - small to big - automatically
Narrowing casting - big to small - manually

 */

        //Widening casting - small to big - automatically
        short s = 10;
        int a = s;

        System.out.println(s);
        System.out.println(a);
//Narrowing casting Narrowing casting Narrowing casting
        int x = 100;
        byte b1 = (byte)x;
        System.out.println(b1);


    }
}
