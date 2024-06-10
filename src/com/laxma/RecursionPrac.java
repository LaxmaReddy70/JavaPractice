package com.laxma;

import java.util.Scanner;

public class RecursionPrac {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
           return n*factorial(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("the factorial of a is : "+ factorial(a));

    }
}
