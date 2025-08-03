package com.trix;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a String: ");
        String a = in.next();
        System.out.println(a+ " " +a.charAt(0));
    }
}
