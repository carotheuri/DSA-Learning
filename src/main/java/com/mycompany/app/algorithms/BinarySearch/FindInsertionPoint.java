package com.mycompany.app.algorithms.BinarySearch;

public class FindInsertionPoint {
    public static void main(String[] args) {
        //Given a sorted array of distinct integers and a target value,
        // return the index if the target is found.
        // If not, return the index where it would be if it were inserted in order.
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(findInsertionPoint(arr, target));
    }
    public static  int findInsertionPoint(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        int position_expected = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else
                return mid;
        }
        return start;
    }
}
