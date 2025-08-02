package com.trix;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        //to add manually in the list will be like the following
//        list.add(77);
//        list.add(79);
//        list.add(78);
        // printing in the ArrayList if too easy
//        System.out.println(list);
//        list.set(0,12);
//        System.out.println(list);

        // manually input in ArrayList
        System.out.println("Write your 5 numbers to adding in the ArrayList");
        for (int i = 0; i<5;i++){
            list.add(in.nextInt());
        }


        System.out.println("Here are in the ArrayList");
        //Manually output in ArrayList
        for (int i = 0;i<5;i++){
            System.out.print(list.get(i)+ " ");
        }
        //just for a new line
        System.out.println();

        //simple way to get output in the ArrayList
        System.out.println(list);
    }
}
