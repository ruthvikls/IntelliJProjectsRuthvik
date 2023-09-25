package com.StringPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public static void main(String[] args) {

        String name = "VIRAAAAAT";

        Matcher matcher = Pattern.compile("A").matcher(name);
       long num = matcher.results().count();
        System.out.println(num);
    }
}
