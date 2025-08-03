package com.trix;

import java.util.Arrays;

public class SumOfMultiDimentionArray {
    public static void main(String[] args) {
        int sum = 0;
        int [][] arr = {{1,2,3},{3,4,1},{5,8,5,4}};
        for(int row =0;row<arr.length; row++){
            int sumPerson=0;
            for(int col=0;col<arr[row].length;col++){
                sumPerson = sumPerson + arr[row][col];
            }
//            System.out.println(sumPerson);
            if(sumPerson>sum){
                sum = sumPerson;
            }
        }
        System.out.println(sum);
    }
}
