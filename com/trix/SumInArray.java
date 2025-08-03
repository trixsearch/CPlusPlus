package com.trix;


// Program to Sum in a single dimention array

public class SumInArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int sum =0;
        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}