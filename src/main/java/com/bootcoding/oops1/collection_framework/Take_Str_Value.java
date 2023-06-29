package com.bootcoding.oops1.collection_framework;
import java.util.ArrayList;
import java.util.Scanner;

public class Take_Str_Value {
    //Take string values from user using Scanner and use Arraylist to store them and print them with their size.....
    public static void main(String[] args)
    {
        ArrayList<String> str = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //str.add(sc.nextLine());
        System.out.println(str);
        while(true){
           String str1 = sc.nextLine();
           if(str1.equals("-1")){
               break;
           }
           else{
               str.add(str1);
           }

        }
        for(String s : str){
            System.out.println(s);
        }
    }
}
