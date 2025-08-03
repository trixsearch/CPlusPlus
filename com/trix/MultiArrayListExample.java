package com.trix;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayListExample {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //MultiDimentional Array List

        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        // After this we need to add the list in the Empty Array list
        // Next Code loop her array list mein jakar ek ek arraylist bhar dega
        // initialisation
        for (int i =0;i<3;i++){
            list.add(new ArrayList<>());
        }

        // taking Input in multi dimentional Array
        System.out.println("Write any numbers for the Input");
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(scn.nextInt());
            }
        }

        System.out.println(list);
    }
}
