package org.example;

public class Throw_Eg {
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public void checkAgelimitforVoting(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not Eligible for voting");
        }
        else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Throw_Eg obj = new Throw_Eg();
        obj.checkAgelimitforVoting(17);
    }

}
