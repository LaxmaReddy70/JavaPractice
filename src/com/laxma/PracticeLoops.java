package com.laxma;

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {

//        System.out.println("enter no of rows");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=n;i>0;i--){
//            for(int j=i;j<=n;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //p2
//        System.out.println("enter N");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//
//        for (int i=1;i<=n;i++){
//            sum+=(2*i);
//
//        }
//        System.out.println(sum);

//        //p3
//        System.out.println("enter N");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d*%d=%d \n",n,i,(n*i));
//        }

//        //p4
//        System.out.println("enter N");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=10;i>=1;i--){
//            System.out.printf("%d*%d=%d \n",n,i,(n*i));
//        }

//        //p5
//        System.out.println("enter N");
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int factorial=1;
//        for (int i=n;i>0;i--){
//             factorial = factorial*i;
//        }
//        System.out.printf("the factorial of %d is %d",n,factorial);

        //p6
//        System.out.println("enter N");
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int factorial=1;
//        int i=1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("the factorial of %d is %d",n,factorial);

//        //p7
//        System.out.println("enter n");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//
//        for(int i=1;i<=10;i++){
//
//            sum+=(n*i);
//
//        }
//        System.out.println(sum);

        //p8
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum += (2*i);
            i++;
        }
        System.out.printf("the sum of first %d even numbers is %d",n,sum);


    }
}
