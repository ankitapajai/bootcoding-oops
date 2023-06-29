package com.bootcoding.oops1.collection_framework;

import java.util.ArrayList;

public class Store_Int_Str {
    //Create ArrayList of following classes and store into it and print them
    //Integer
    //String

    public static void main(String[] args) {
        //create Integer ArrayList....
        ArrayList<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(20);
            nums.add(56);
            nums.add(11);
            nums.add(5);
            //for(int i=0; i<nums.size(); i++)

            //here we use java for each loop....
              for(int ab : nums)
              {
                  System.out.println("ArrayList elements: " + ab);

              }
        System.out.println(" ");

        //create String ArrayList......
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("java");
        str.add("programming");

        //java for each loop.....
        for (String st: str){

            System.out.println("String elements: " + st);
        }
    }
}
