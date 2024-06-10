package com.laxma;

import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
//        int [] marks= {2, 3, 4, 5, 6};
//        for (int element:marks) {
//            System.out.print(element+" ");
//        }
//        int[][] flats;
//        flats = new int[3][3];
//        flats[0][0]=101;
//        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=201;
//        flats[1][1]=202;
//        flats[1][2]=203;
//        flats[2][0]=301;
//        flats[2][1]=302;
//        flats[2][2]=303;
//
//       for(int i=0;i< flats.length;i++) {
//           for (int j = 0; j < flats[i].length; j++) {
//
//               System.out.print(flats[i][j] + " ");
//           }
//           System.out.println();
//       }

//        float[] marks={45f,63f,56f,99f,83f};
//        float sum=0;
//        for (float element:marks) {
//            sum+=element;
//            System.out.print(element +" ");
//        }
//        System.out.printf("\nTotal sum of all elements in an array is %f",sum);

//        float[] marks={45f,63f,56f,99f,83f};
//        float sum=0;
//        for(int i=0;i< marks.length;i++){
//             sum +=marks[i] ;
//            System.out.print(marks[i] +" ");
//        }
//        System.out.printf("\nTotal sum of all elements in an array is %f",sum);

        //p3
//        float[] marks={45f,63f,56f,99f,83f};
//        System.out.println("give the value of marks ");
//        Scanner sc= new Scanner(System.in);
//        float num=sc.nextFloat();
//        boolean isInArray = false;
//        for (int i=0;i< marks.length;i++){
//            if(num==marks[i]){
//                isInArray= true;
//                break;
//            }
//
//        }
//        if(isInArray==true){
//            System.out.println("Yayy..! given value is present in the array");
//        }
//        else {
//            System.out.println("Sorry! given value is not present in the array");
//        }

        //p4

//        float[] marks={45f,63f,56f,99f,83f};
//        float sum=0;
//        for (float element:marks) {
//            sum+=element;
//        }
//        float avg= sum/marks.length;
//        System.out.println("The average of given marks in an array is : "+avg);

        //p5

//        int [][] mat1={{1,2,3},{4,5,6},{7,8,9}};
//        int [][] mat2={{9,8,7},{6,5,4},{3,2,1}};
//        int [][] res={{0,0,0},{0,0,0},{0,0,0}};
//
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                 res [i][j]=mat1[i][j]+mat2[i][j];
//            }
//            System.out.println();
//
//        }
//        for(int i=0;i<res.length;i++){
//            for(int j=0;j<res[i].length;j++){
//                System.out.print(res[i][j] +" ");
//            }
//            System.out.println();
//        }

        //p6

//        int [] arr={1,2,3,4,5,6,7,8};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//
//        }
//
//        for (int element:arr) {
//            System.out.print(element + " ");
//
//        }

//        //p7
//        int [] arr={1,2,3,122,5,6,7,8};
//        int max=Integer.MIN_VALUE;
//
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//
//            }
//        }
//        System.out.println(max);

        //p8
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 4, 5,6, 7};
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }

}
