package org.example;

import java.util.Arrays;

public class String_eg {
    public static void main(String[] args) {
        /*
        String - used to store more than one chars
        "" - surrounded with quotes

        Literal way - String Pool Memory
        New Keyword Way  - Heap Memory

         */
        //literal way
        String a = "hello"; // shared memory //123
        String c = "Hello"; //123

        //new keyword way
        String b = new String("hello"); //789

        //== and .equals
        System.out.println(a == b);
        System.out.println(a == c);

        //equals
        System.out.println(a.equals(b)); // it will not check the memory
        System.out.println(a.equals(c));
        //equals ignore case
        System.out.println(a.equalsIgnoreCase(c));

        //starts-with
        System.out.println(a.startsWith("He"));

        //ends-with
        System.out.println(a.endsWith("o"));

        //contains
        System.out.println(a.contains("ll"));

        //char-at

        System.out.println(a.charAt(2)); //h-0 e-1 l-2 l-3 o-4

        //index-of
        System.out.println(a.indexOf("l"));
        //last index of
        System.out.println(a.lastIndexOf("l"));

        String i = "ice";
        String j = "juice";
        System.out.println(i.concat(j));
        System.out.println(i+j);

        String k = "kalpana is a sweet girl";
        System.out.println(k.replace("a","0"));

        //split
         String[] words = k.split(" ");
        System.out.println(Arrays.toString(words));

        //trim
        String l = "     love my country     ";
        System.out.println(l.trim());

        System.out.println(l.strip());


        //leading strip - left space
        System.out.println(l.stripLeading());

        //trailing strip - right space
        System.out.println(l.stripTrailing());

        //upper case

        System.out.println(l.toUpperCase());
        System.out.println(l.toLowerCase());


        String appli = "Application id is: 4997976";
        System.out.println(appli.substring(19,26));

        String[] sp = appli.split(": ");
        System.out.println(sp[0]);
        System.out.println(sp[1]);

        //to chararray
        String m = "mahath";
        char[] arr = m.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
