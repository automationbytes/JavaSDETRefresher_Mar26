package org.example;

public class CallingCalc {
    public static void main(String[] args) {
        Calculator.add(5,10); //static
        Calculator c = new Calculator();
        c.sub(10,5);
    }
}
