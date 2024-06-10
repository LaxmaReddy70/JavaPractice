package com.laxma;

import java.util.Scanner;

public class MethodPrac {
    static int add(int a,int b){
        int c;
        c = a+b;
        return c;
    }
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d*%d=%d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for(int i=0; i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fibanacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {


            return fibanacci(n-1)+fibanacci(n-2);


        }


    }

    static int recursiveSum(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        else{
            return sum=n+recursiveSum(n-1);
        }
    }

    public static void main(String[] args) {
        int x=23;
        int y=25;
        int z;
        z=add(x,y);
        System.out.println(z);


        System.out.println("the sum of n natural numbers is : "+recursiveSum(5));
        System.out.println("enter the nth number of series:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println( fibanacci(a));
        for(int i=1;i<=a;i++){
            System.out.print(fibanacci(i)+" ");
        }



    }

}
