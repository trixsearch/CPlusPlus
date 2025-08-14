package com.trix;


//Linear Search

//Searching char in a String
public class SeachInStrings {
    public static void main(String[] args) {
        String name = "AbhinavSahu";
        char target ='S';
        System.out.println(searchEach(name,target));
    }

    //using for loop
    static boolean search(String str,char target){
        int n=str.length();
        if(n==0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    //using for-each loop
    static boolean searchEach(String str,char target){
        int len = str.length();
        if (len == 0) {
            return false;
        }
        for(char n:str.toCharArray()){
            if(n==target){
                return true;
            }
        }
        return false;
    }
}
