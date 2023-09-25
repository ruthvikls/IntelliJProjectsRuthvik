package com.StringPractice;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to reverse each word :");
        String sentence = sc.nextLine();
        String[] eachWord = sentence.split("\\s");
        String reverse = "";
        for(String name : eachWord){
            StringBuilder builder = new StringBuilder(name);
            builder.reverse();
            reverse = reverse+ builder.toString()+" ";
        }
        System.out.println(reverse);
    }
}
