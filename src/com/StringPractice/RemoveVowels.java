package com.StringPractice;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "alrighty then";

        System.out.println( removeVowels(input));

    }

    public static String removeVowels(String input){
        StringBuilder sb = new StringBuilder();
        String vowels = "AEIOUaeiou";

        for(char character:input.toCharArray()){
            if(vowels.indexOf(character)==-1){
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
