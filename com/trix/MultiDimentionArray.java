package com.trix;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr = new int[3][2];
        //writing manually the whole numbers for the loop
//        int [][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        //taking input in a 2D array
        for (int row =0;row< arr.length;row++){
            for(int col =0;col< arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
//        // for Printing or ouput the whole 2D array traditional method
//        for (int row =0;row<arr.length;row++){
//            for(int col =0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        //we can also use the traditional tostring method to do the same
        for (int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }


//        int []arr = {1,2,3,4,5,7,6};
//        int sum =0;
//        for (int i=0; i< arr.length; i++){
//            if (i%2==0){
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println(sum);
    }
}