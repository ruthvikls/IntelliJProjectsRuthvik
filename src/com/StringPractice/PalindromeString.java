package com.StringPractice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.nextLine();


        String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equalsIgnoreCase(reverse)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
