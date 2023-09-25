package com.ArraysPractice;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] num = {11,22,33,44,55,66,77,88,99};
        System.out.println(num.length);
        SecondLargest(num);

    }
    public static void SecondLargest(int[] numbers){
        Arrays.sort(numbers);
      int size=   numbers.length;
        int sLargest = numbers[size-2];
        System.out.println(sLargest);
    }
}
