package com.laxma;

import java.util.Arrays;
import java.util.Scanner;

public class Practiceset4 {
    public static void main(String[] args){


//        //P1
//        System.out.println("number of marks you got in physics");
//        Scanner sc = new Scanner(System.in);
//        float a= sc.nextFloat();
//        System.out.println("number of marks you got in chemistry");
//        float b= sc.nextFloat();
//        System.out.println("number of marks you got in maths");
//        float c= sc.nextFloat();
//
//        float average;
//        average = (a+b+c)/3.0f;
//
//        if(a>=33&&b>=33&&c>=33&&average>=40){
//            System.out.println("congratulations,you are passed");
//        }
//        else{
//            System.out.println("sorry, you are not passed");
//        }

//        //p2
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the number of the day ");
//        int day = sc.nextInt();
//
//        switch(day){
//
//            case 1 -> System.out.println("this is MONDAY");
//            case 2 -> System.out.println("this is TUESDAY");
//            case 3 -> System.out.println("this is WEDNESDAY");
//            case 4 -> System.out.println("this is THURSDAY");
//            case 5 -> System.out.println("this is FRIDAY");
//            case 6 -> System.out.println("this is SATURDAY");
//            case 7 -> System.out.println("this is SUNDAY");
//
//        }

//        //p3
//        System.out.println("Enter the year");
//        Scanner sc= new Scanner(System.in);
//        int year=sc.nextInt();
//
//        if(year%4==0){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println("Tada.... It's a Leap year");
//                }
//                else{
//                    System.out.println("it is not a leap year");
//                }
//            }
//            else{
//                System.out.println("Tada.... It's a Leap year");
//            }
//
//        }
//        else{
//            System.out.println("it is not a leap year");
//        }

        //p4
        System.out.println("write the url ");
        Scanner sc = new Scanner(System.in);
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("The url you typed is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("The url you typed is a organisation website");
        }
        else if(url.endsWith(".in")){
            System.out.println("The url you typed is a indian website");
        }

    }
}
