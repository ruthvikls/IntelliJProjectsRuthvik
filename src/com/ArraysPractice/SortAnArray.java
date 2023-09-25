package com.ArraysPractice;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr= {1,3,4,5,3,2,5446,3737,34,653};

        for(int i=0;i<arr.length;i++) {
            for(int j = i+1;j<arr.length;j++) {
                int temp =0;
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int a:arr) {
            System.out.println(a);
        }
    }
}
