package org.example;

public class TryCatch_Eg {
    public static void main(String[] args) {

     //   System.out.println(1/0);
        //try catch block

        try {

            String a = null;
            System.out.println(a.length()); //throw me a error
//            int[] i = {10};
//            System.out.println(i[56]); //throw me a error
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Array out of bounds exception caught");
        }catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Arithmetic exception caught");
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("This will always execute");
        }

        System.out.println("Hello");
    }
}
