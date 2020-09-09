package com.search.problems;
/*
Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order. Write efficient functions to find floor and ceiling of x.

Examples :

For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array

 */
public class CeilAndFloorProblem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int key=3;
        int result=findCeil(arr,0,arr.length-1,key);
        if(result==-1){
            System.out.println("no Ceil Found");
        }
        else{
            System.out.println("Ceil found at pos:"+result+" and is:"+arr[result]);
        }


    }

    private static int findCeil(int[] arr, int l, int r, int key) {

        int mid=l+(r-l)/2;
        if(arr[l]>=key){
            return l;
        }
        if(arr[r]<key){
            return -1;
        }
       if(key>arr[mid]){
           return findCeil(arr,mid+1,r,key);
       }
       else{
           return findCeil(arr,l,mid-1,key);
       }
    }
}
