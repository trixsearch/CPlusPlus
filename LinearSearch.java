package com.trix;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,32,35,36,22};
        System.out.println(searchArray(nums,32));;
    }
    static int searchArray(int[]arr,int num){
        int ans=0;
        System.out.println("Searching in the Array");
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                ans=i;
            }
            else{
                ans=-1;
            }
        }
        return ans;
    }
}

