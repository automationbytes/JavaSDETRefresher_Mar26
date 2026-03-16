package org.example;

public class OverLoading {
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

     double add(double a, double b, double c){
        return a+b+c;
    }

    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    double add(double a, double b, double c,double d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        System.out.println(overLoading.add(5.5,10.5,.3));
    }


}
