package com.mycompany.app.algorithms.LinearSearch;

public class EvenDigitsCount {
    public static void main(String[] args) {
        int[] arr = {4,12,900,3245,95,128};
        countEvenDigits(arr);
    }
    static void countEvenDigits(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int digitCount = (int)Math.log10(arr[i])+1;
            if(digitCount%2 == 0 ){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
