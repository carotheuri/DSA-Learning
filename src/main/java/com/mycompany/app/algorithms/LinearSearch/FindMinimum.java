package com.mycompany.app.algorithms.LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {1,20,-7,-8};
        int minimum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
