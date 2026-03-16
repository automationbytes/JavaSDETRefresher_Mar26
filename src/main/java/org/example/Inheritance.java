package org.example;

//parent class
class Animal{

    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
//child class
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
//grand child class
class BullDog extends Dog{
    void growl(){
        System.out.println("Bulldog is growling");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.sleep(); // Inherited method from Animal class
        dog.bark(); // Dog's own method

        Animal animal = new Animal();
        animal.eat(); // Animal's own method
        animal.sleep(); // Animal's own method
    }
}

/*

Animal - Parent

Dog  - (Child of Animal) Cat (Child of Animal)

Bull Dog (Child of Dog and Grand Child of Animal)


 */
