// Simple java program to take input of an array and print it as it is
// Taking input using For Loop

import java.util.Scanner;

public class InputInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write the size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter "+ n +" Elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Here are your elements of the array: ");
        for (int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
