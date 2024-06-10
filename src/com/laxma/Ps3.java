package com.laxma;
import java.util.Scanner;

public class Ps3 {
    public static void main(String[] args) {
        // p1
        String name = "IAM LAXMA";
        System.out.println(name.toLowerCase());

        //p2
        String s2= "i want to learn code fastly";
        s2=s2.replace(" ","_");
        System.out.println(s2);

        //p3
        String letter= "hello this is   laxma";
        System.out.println(letter.indexOf("  "));
        System.out.println(letter.indexOf("   "));

        //p4
        String greet= "Dear <|name|> , Thanks a lot !";
        System.out.println("print your name");
        Scanner sc= new Scanner(System.in);
        String gname=sc.nextLine();

        System.out.println(greet.replace("<|name|>",gname));

        //p5
        String typeLetter= "Hello laxma, You are going good at coding, be patient and consistent to acheive your goal. Regards Yourself";
        String formatedLetter= "Hello laxma,\n\t You are going good at coding, be patient and consistent to acheive your goal.\n Regards\n Yourself";
        System.out.println(formatedLetter);

    }
}
