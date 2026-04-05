package com.crud.test.interview.loop_interview;

public class MaximumSumOfSubarrayKSize {

    public static int maxSum(int[] arr, int k) {
        int sum = 0, max = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];
        max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]a = {10,40,20,30};
        int k = 2;
        System.out.println(maxSum(a,k));
    }
}
