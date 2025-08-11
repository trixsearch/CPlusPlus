package com.trix;


import java.util.Arrays;

// linear Search in 2d array
public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {2,3,4},
                {5,6,7}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }
    static int[] search(int[][]arr,int target){
        int len=arr.length;
        int[]ans=new int[1];
        for(int row=0;row<len;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
//                    ans[0]=row;
//                    ans[1]=col;
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
