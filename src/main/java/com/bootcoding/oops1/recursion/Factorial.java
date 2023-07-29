package com.bootcoding.oops1.recursion;
public class Factorial {
    //WAP to find factorial using recursion in java...

    public static void main(String[] args) {
        int number = 5, result;
        result = printFactorial(number);
        System.out.println("The factorial of " + number + " is:- " + result);
    }

    //factorial calculate logic...
    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * printFactorial(n-1);
        }
    }

}
