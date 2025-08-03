package com.trix;

public class MaxInArray {
    public static void main(String[] args){
        int [] arr ={1,2,33,4,57,6,87,3,244};
        //for Printing Max in the whole array
//        System.out.println(maxi(arr));
        //for printing max in a range
        System.out.println(maxi(arr,1,6));
    }
    static int maxi(int[]  arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int maxi(int[]arr,int startIndex,int endIndex){
        int max =0;
        for(int i=startIndex;i<=endIndex;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
