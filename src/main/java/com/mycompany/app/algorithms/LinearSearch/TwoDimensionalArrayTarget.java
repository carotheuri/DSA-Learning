package com.mycompany.app.algorithms.LinearSearch;

public class TwoDimensionalArrayTarget {
    public static void main(String[] args) {
        int target = 56;
        int[][] arr = {
                {4,1,9},
                {32,95,12}
        };
        //searchArray(arr,target);
        maxInArray(arr);
    }
    public static void searchArray(int[][] arr, int target){
        boolean exists = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == target){
                    System.out.println("The target is at "+ i +" row and "+ j + " column");
                    exists = true;
                    break;
                }
            }
        }
        System.out.println(exists);
    }
    public static void maxInArray(int[][] arr){
        int maxValue = arr[0][0];
        for (int[] ints: arr) {
            for (int colValue:ints) {
                if(colValue > maxValue){
                    maxValue = colValue;
                }
            }
        }
        System.out.println(maxValue);
    }
}
