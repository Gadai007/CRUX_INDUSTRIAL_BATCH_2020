package Lecture4;

import java.util.ArrayList;

public class ArrayListeg {
    public static void main(String[] args) {
         ArrayList list = new ArrayList();

         list.add(4);
         list.add("Hello");

        System.out.println(list.size());

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(0,2));
    }
}
