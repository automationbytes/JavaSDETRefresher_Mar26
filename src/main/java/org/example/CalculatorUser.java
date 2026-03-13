package org.example;

public class CalculatorUser {
    public static void main(String[] args) {
        // Call static methods directly on the class
        Calculator.add(3, 5);     // prints 8
        Calculator.mul(3, 4);     // prints 12
        Calculator.div(8, 2);     // prints result from Calculator.div (note: current implementation multiplies)

        // Call instance method by creating an object
        Calculator calc = new Calculator();
        calc.sub(10, 4);          // prints 6
    }
}