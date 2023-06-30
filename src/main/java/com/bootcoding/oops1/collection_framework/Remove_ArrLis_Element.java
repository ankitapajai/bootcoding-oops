package com.bootcoding.oops1.collection_framework;

import java.util.ArrayList;

public class Remove_ArrLis_Element {
    public static void main(String[] args) {
        //create one array lists...
        //add element into arraylist
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("java");
        str.add("programming");
        str.add("goal");
        str.add("dedication");
        //for each loop
        for(String st : str) {
            System.out.println("Arraylist element is: " + st);
        }

        System.out.println(" ");

        //remove element from index 4...
        String abc = str.remove(4);
        System.out.println("updated arraylist: " +str);
        System.out.println("removed element: " +abc);

        System.out.println(" ");

        String abc1 = str.remove(2);
        System.out.println("updated arraylist: " +str);
        System.out.println("removed element: " +abc1);

    }
}
