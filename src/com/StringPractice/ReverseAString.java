package com.StringPractice;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "TEST";

        System.out.println( name.length());
        String revName = "";
        for(int i=name.length()-1;i>=0;i--){
           revName= revName+ name.charAt(i);
        }
        System.out.println(revName);
    }
}
