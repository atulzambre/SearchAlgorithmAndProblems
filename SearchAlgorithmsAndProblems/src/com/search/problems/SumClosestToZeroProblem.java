package com.search.problems;

import java.util.Arrays;

/*
Question: An Array of integers is given, both +ve and -ve.
You need to find the two elements such that their sum is closest to zero.

Algorithm
1) Sort all the elements of the input array.
2) Use two index variables l and r to traverse from left and right ends respectively. Initialize l as 0 and r as n-1.
3) sum = a[l] + a[r]
4) If sum is -ve, then l++
5) If sum is +ve, then r–
6) Keep track of abs min sum.
7) Repeat steps 3, 4, 5 and 6 while l < r

Time Complexity: complexity to sort + complexity of finding the optimum pair = O(nlogn) + O(n) = O(nlogn)

*/
public class SumClosestToZeroProblem {
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        //QuickSort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        searchSum(arr);
    }

    private static void searchSum(int[] arr) {
        int l=0;
        int r=arr.length-1;

        int minSum=Integer.MAX_VALUE;
        int minL=0,minR=0;

        while(r>l){
           int sum=arr[l]+arr[r];
           if(sum<0){
               l++;
           }
           else{
               r--;
           }

           if(Math.abs(sum)<minSum){
               minSum=sum;
               minL=l;
               minR=r+1;

           }

        }
        System.out.println("Sum Closest to zero is :"+minSum+" first element:"+arr[minL]+" Second element:"+arr[minR]);
    }
}
