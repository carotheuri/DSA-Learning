package com.mycompany.app.algorithms.LinearSearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{3,4,6},{8,4,9}};
        System.out.println( maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        int maxSum = 0;
        for(int[] person:accounts){
            int sum = 0;
            for(int bankAmount:person){
                sum+=bankAmount;
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
