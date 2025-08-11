package com.trix;

public class FindingMinimum {
    public static void main(String[] args) {
        int[] arr = {1,-2,25,-17,11,2,4,5};
        System.out.println(minInRange(arr,1,4));
    }

    // simple minimum for whole Array
    static int min(int[]arr){
        int min=0;
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    // minimum in range
    static int minInRange(int[]arr,int start,int end){
        int min=0;
        int len=arr.length;
        if(len==0){
            return 0;
        }
        for(int i=start;i<end;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
