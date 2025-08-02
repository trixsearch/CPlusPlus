package com.trix;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
    int [] nums = {3,2,1,4};
    System.out.println(Arrays.toString(nums));
    changeMyValue(nums);
    System.out.println(Arrays.toString(nums));
    }
    static void changeMyValue(int[] a){
    a[0]=5;
    }
}