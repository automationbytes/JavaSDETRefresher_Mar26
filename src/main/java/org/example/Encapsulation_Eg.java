package org.example;
class Encap{
    private String name = "John";
    private int age;

    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation_Eg {

     public static void main(String[] args) {
         Encap x = new Encap();

         x.setName("Tom");
         System.out.println(x.getName());

     }
}
