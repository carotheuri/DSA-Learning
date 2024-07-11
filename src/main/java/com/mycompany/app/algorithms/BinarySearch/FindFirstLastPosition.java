package com.mycompany.app.algorithms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindFirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,6,7,7,7,7,8,9,12};
        int target = 7;
        int[] output = {-1,-1};
        int startIndex = findFirstLastPosition(arr, target,true);
        int endIndex = findFirstLastPosition(arr, target,false);
        output[0] = startIndex;
        output[1] = endIndex;
        System.out.println(Arrays.toString(output));
    }
    public static int findFirstLastPosition(int[] arr, int target,boolean firstIndex){
        int answer = -1;
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
            else{
                answer=mid;
                //assuming the answer is found here we need to check the left or right if there are any other numbers that exist.
                if(firstIndex == true)
                    end = mid - 1;
                else
                    start = mid+1;
            }
        }
        return answer;
    }
}
