package com.StringPractice;

import java.util.*;

public class MaximumOccurenceOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to Find Max Occurence of a Word :");
        String word = sc.nextLine();
        char[] ch = word.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:ch){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
        else{
            hm.put(c,1);
            }
        }
        int maxInt=0;
        char maxCount=' ';
        for(Map.Entry<Character,Integer> hashLoop :hm.entrySet()){
            if(maxInt<hashLoop.getValue()){
                maxInt=  hashLoop.getValue();
                maxCount = hashLoop.getKey();
            }

        }
        System.out.println("The character "+maxCount+" has been repeated "+ maxInt + " times");


    }
}
