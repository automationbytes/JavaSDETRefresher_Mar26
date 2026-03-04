package org.example;

public class Variables {
    public static void main(String[] args) {
       // int a = 10;

        byte z = (byte) 256;
        System.out.println(z); //127 -128 -127 -126 -125 ...

        /*
        byte - 1 byte - 8 bits - 2^8 -> 256 (-128 => 0 => 127)
        short - 2 byte - 2^16
        int - 4 byte
        long - 8 byte

        float - 4 byte
        double - 8 byte

        boolean - 1 bit true/false
        char - 2 bytes

         */
        short s = 4656; //-32768 to 32767

        float f = 5.5f;
        long l = 4564L;

        char c = 'a';

        boolean bool = true; //false/true -> small letters


    }
}
