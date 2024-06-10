package com.laxma;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner s= new Scanner(System.in);
     /*   int a =s.nextInt();
        int b =s.nextInt();
        int c = a+b;
        System.out.println("the sum of these two numbers is "+ c);*/

        String str = s.nextLine();
        System.out.println(str);

    }

}
