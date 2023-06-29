package com.bootcoding.oops1.collection_framework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrLis_Ex1 {
    public static void main(String[] args) {

        //we can create arraylist here.....
        // ArrayList<type> abc = new ArrayList<>();  here ----type--- indicates the type of an arraylist....

        //create Integer type arraylist here...
        //add integer to arraylist...

        //-------add() Element to an ArrayList--------
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("Integer ArrayList: " +nums);

        //create String type of arraylist here.....
        //add string in arraylist...
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("java");
        str.add("programming");
        System.out.println("String ArrayList: " +str);

        //change the string element of the array list...
        str.set(2,"javascript");
        System.out.println("changing string: " +str);

        System.out.println(" ");

        //-------Access Arraylist elements--------
        //To access an element from the arraylist, we use the -----get()---- method of the ArrayList class.
        int abc = nums.get(1);
        System.out.println("Elements at index 1: " +abc);
        System.out.println("Elements at index 2: " +nums.get(2));  //2nd method to access the elements...

        System.out.println("");

        String st = str.get(1);
        System.out.println("string at index 1: " +st);
        System.out.println("String at index 2: " +str.get(2));  //2nd method to access the elements...



    }

}
