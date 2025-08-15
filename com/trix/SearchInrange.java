package com.trix;

public class SearchInrange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(searchRange(nums,1,4,3));
    }

    // using simple for loop
    static int searchRange(int[]arr,int start,int end,int target){
        int len = arr.length;
        if(len==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
