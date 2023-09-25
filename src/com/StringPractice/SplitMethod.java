package com.StringPractice;

public class SplitMethod {
    public static void main(String[] args) {

        String name = "showing 1 to 20 of 8211 (426 Pages)";

       String firstPart =  name.split(" Pages")[0];
        System.out.println(firstPart);
      String secondPart =   firstPart.split("\\(")[1];
        System.out.println(secondPart);
        int totalPages = Integer.valueOf(secondPart);
        System.out.println(totalPages+1);
    }
}
