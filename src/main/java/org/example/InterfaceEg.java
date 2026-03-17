package org.example;

interface Mobile{
    void call();
    void message();
}

interface Camera{
    void photo();
    void video();
}

class Samsung implements Mobile, Camera{

    @Override
    public void call() {
        System.out.println("Calling from Samsung");
    }

    @Override
    public void message() {
        System.out.println("Messaging from Samsung");
    }

    @Override
    public void photo() {
        System.out.println("Taking photo from Samsung");
    }

    public void video() {
        System.out.println("Recording video from Samsung");
    }
}

class Apple implements Mobile{

    @Override
    public void call() {
        System.out.println("Calling from Apple");
    }

    @Override
    public void message() {
        System.out.println("Messaging from Apple");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.call();
        samsung.message();
        samsung.video();
        samsung.photo();

        Apple apple = new Apple();
        apple.call();
        apple.message();
    }
}
