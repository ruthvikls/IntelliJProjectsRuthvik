package com.ArraysPractice;

public class LinearSearch {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,66,33,44,22,66};
                LinearSearch.linearSearch(num,88);
    }

    public static void linearSearch(int[] numbers, int tobeSearched){
    int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==tobeSearched){
                System.out.println("The Number is found a the index: "+ i);
                count++;
            }
        }
        if(count==0){
            System.out.println("The Number is not found in the list");
        }
    }
}
