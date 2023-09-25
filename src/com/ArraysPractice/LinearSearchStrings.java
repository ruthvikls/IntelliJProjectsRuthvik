package com.ArraysPractice;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String[] programs ={"java","c sharp","c language","python", "ruby","Kotlin","java"};
        StringLinear(programs,"java");
    }
    public static void StringLinear(String[] data,String toBeSearched){
        int count = 0;
        for(int i=0;i<data.length;i++){
            if(data[i].equalsIgnoreCase(toBeSearched)){
                System.out.println("The String is found a the index: "+ i);
                      count++;
            }
        }
        if(count==0){
            System.out.println("The String is not found in the list");
        }
    }
}
