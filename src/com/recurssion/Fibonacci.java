package com.recurssion;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fib(8));
    }
     public static int fib(int n){
        if(n<1){
            System.out.println("Error Message");
            return -1;
        }else if(n==1||n==2){
            return n-1;
        }else{
          return fib(n-1) +fib(n-2);
        }
     }
}
