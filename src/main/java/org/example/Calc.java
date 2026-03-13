package org.example;
/*
Method -


 */
public class Calc {
    //no return
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    //return
    public static int sum(int a, int b){
        return a+b;
    }

    public String name(String name){
        return "Hello";
    }
    //main method
    public static void main(String[] args) {
        Calc c = new Calc(); //c is object

//        c.add(5,10); //not returning directly printing
//        System.out.println(c.sum(5,5)+5);
        int totalmark = c.sum(50,80);
        add(5,7);
    }

}
