package com.mycompany.app.algorithms.BinarySearch;

public class SmallestGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(findSmallestGreaterThanTarget(arr, target));
    }
    public static  char findSmallestGreaterThanTarget(char[] arr, char target){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        if(start >=arr.length){
            return arr[0];
        }
        return arr[start];
    }
}
