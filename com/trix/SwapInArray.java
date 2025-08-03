package com.trix;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        swap(arr,1,2);

        System.out.println("Swapped array");
        System.out.println(Arrays.toString(arr));

//        checking for reversing of an Array
        System.out.println("Here is reversed Array");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Program to Swap two numbers in an array
    static void swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
    // Program to reverse the Array
    // here we are using the SwapMethod to do so

    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

}
