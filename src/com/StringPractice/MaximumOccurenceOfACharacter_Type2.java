package com.StringPractice;

public class MaximumOccurenceOfACharacter_Type2 {
    public static void main(String[] args) {
        String name = "bumblebee";
        char toFind ='m';
        findOccurence(name,toFind);
    }

    public static void findOccurence(String name, char toFind){
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==toFind){
                count++;
            }
        }
        System.out.println("The Character "+toFind+" has been repeated "+count+" times "+"In the word "+name);
    }
}
