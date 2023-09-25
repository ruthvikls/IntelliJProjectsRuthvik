package com.StringPractice;

import java.util.LinkedHashSet;

public class EliminateDuplicates {
    public static String removeDuplicates(String name) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for (char c : name.toCharArray()) {
            hs.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : hs) {
            sb.append(ch);
        }

    return sb.toString();
    }
    public static void main(String[] args) {
        String name = "immediate";
        System.out.println(removeDuplicates(name));
    }
}
