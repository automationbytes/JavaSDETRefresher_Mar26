package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class List_Eg {
    public static void main(String[] args) {
       ArrayList list = new ArrayList<>();
       list.add(1);
       list.add("Hello");
       list.add(3.14);
        System.out.println(list);




//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Hello");
//        list2.add("World");
//        System.out.println(list2);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); //0
        list1.add(2); //1
        list1.add(3);
        list1.add(4);
        list1.add(40);
        list1.add(4);

        System.out.println(list1); //[1, 2, 3]
        System.out.println(list1.size()); //size of the list (instead of length)
        //add, remove, get, size, clear, contains
        System.out.println(list1.get(1)); //2
        list1.remove(1);


        System.out.println(list1);
        System.out.println(list1.size());


        ArrayList newlist = (ArrayList) list1.clone();
        System.out.println(newlist);
        newlist.clear();
        System.out.println(newlist);

        //contains
        System.out.println(list1.contains(3)); //true
        System.out.println(list1.contains(2)); //false
        /*

           //for loop
        for (int i = 0; i < b.length; i++) {
            System.out.println(i+"-> "+b[i]);
        }
        //for each
        for(int x : b){
            System.out.println(x);
        }

         */
        //iterating over the list
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("*********");

        //for each loop - recommended
        for(Object num : list1) {
            System.out.println(num);
        }

        System.out.println("*********");

        //lambda expression
        list1.forEach(x -> System.out.println(x));

        //sorting - ascending order
        list1.sort((a,b) -> a.compareTo(b));
        System.out.println(list1);

        //descending order
        list1.sort((a,b) -> b.compareTo(a));
        System.out.println(list1);


        //Recommended way to sort
        //sorting using Collections class
        Collections.sort(list1);
        System.out.println(list1);
        //descending order
        list1.sort(Collections.reverseOrder());
        System.out.println(list1);



        //natural sorting order
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

        //natural sorting order
        list1.sort(Comparator.naturalOrder()); //ascending
        list1.sort(Comparator.reverseOrder()); //reverse (automatically descending ordeR)
        System.out.println(list1);

//        list1.set(10, 100); //update value at index 0 to 100
//        System.out.println(list1);
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        list1.add(null); //add value at index 0 to 100
        System.out.println(list1);

                list1.set(10, 100); //update value at index 0 to 100
        System.out.println(list1);

    }
}
