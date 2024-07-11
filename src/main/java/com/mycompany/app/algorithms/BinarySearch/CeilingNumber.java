package com.mycompany.app.algorithms.BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(findCeiling(arr, target));
    }
    public static  int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else
                return arr[mid];
        }
        return arr[start];
    }
}
