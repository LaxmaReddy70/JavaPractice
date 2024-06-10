package com.laxma;

public class VariableArgumentPrac {
    static int sum(int ...arr){
        int result=0;
        for(int element:arr){
            result+=element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of given numbers is : " +sum(11,12,13));

    }
}
