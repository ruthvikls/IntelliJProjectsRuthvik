package com.ArraysPractice;

public class MaximumNumberInAnArray {
    public static void main(String[] args) {
        int[] num = {11,22,33,44,55,666,222,424,241,12341,34,2242,22,414,14,1,14,14,22323,242,23,422,4,24};
        MaxNumber(num);
    }
    public static void MaxNumber(int[] numbers){
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
}
