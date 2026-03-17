package org.example;

abstract class AbstractParent{
    //abstract - Method without body
    abstract void marriage();


    //non-abstract - Method with body
    void gift(){
        System.out.println("Gift is Car, House");
    }
}

class Abstract_Child extends AbstractParent{
    @Override
    void marriage() {
        System.out.println("Partner Name is XYZ");
    }
}


public class Abstract_Parent {
    public static void main(String[] args) {
        Abstract_Child child = new Abstract_Child();
        child.marriage(); // This will call the overridden method in the Child class
        child.gift(); // This will call the method from the Parent class, as it is not overridden in the Child class
    }
}
