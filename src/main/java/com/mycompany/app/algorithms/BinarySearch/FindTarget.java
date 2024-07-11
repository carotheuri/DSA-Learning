package com.mycompany.app.algorithms.BinarySearch;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {2,8,12,56,78,112,231};
        int target = 78;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
