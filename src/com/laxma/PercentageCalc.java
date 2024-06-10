package com.laxma;
import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        System.out.println("please post your marks for getting percentage");
        Scanner s = new Scanner(System.in);
        System.out.println("marks you got in telugu");
        double tel = s.nextDouble();
        System.out.println("marks you got in Hindi");
        double hin = s.nextDouble();
        System.out.println("marks you got in English");
        double eng = s.nextDouble();
        System.out.println("marks you got in Mathematics");
        double mat = s.nextDouble();
        System.out.println("marks you got in Science");
        double sci = s.nextDouble();
        System.out.println("marks you got in Social studies");
        double soc = s.nextDouble();
        System.out.println("total marks ");
        double total = s.nextDouble();

        double percentage = ((tel+hin+eng+mat+sci+soc)/total)*100;

        System.out.println("Percentage of your marks are = "+percentage);
    }
}
