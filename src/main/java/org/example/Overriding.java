package org.example;

class Parent{
void marriage(){
    System.out.println("Partner Name is ABC");
}

void gift(){
    System.out.println("Gift is Car, House");
}

}

class Child extends Parent{
    @Override // optional - This annotation is used to indicate that the method is intended to override a method in the superclass. It helps catch errors at compile time if the method does not actually override a method in the superclass (e.g., due to a typo in the method name or incorrect parameters).
    void marriage() {
        System.out.println("Partner Name is XYZ");
    }
}




public class Overriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.marriage(); // This will call the overridden method in the Child class
        child.gift(); // This will call the method from the Parent class, as it is not overridden in the Child class
    }
}
