package com.search.algorithms;
/*
Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
 Begin with an interval covering the whole array.
 If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.


time complexity to O(Log n).
 */


public class BinarySearchAlg {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int key=100;

//        boolean flag=binarySearchRecursive(arr,0, arr.length-1, key);
        boolean flag=binarySearchIterative(arr,0,arr.length-1,key);
        if (flag)
            System.out.println("element present");
        else
            System.out.println("element not present");
    }

    private static boolean binarySearchIterative(int[] arr, int l, int r, int key) {

        while(r>=l){
            int mid=l+(r-l)/2;
            if(key==arr[mid]){
                return true;
            }
            else if(key>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        return false;
    }

    private static boolean binarySearchRecursive(int[] arr,int l,int r, int key) {
        if(r>=l) {
            int mid = l+(r-l) / 2;

            if (arr[mid] == key)
                return true;
            if (arr[mid] > key)
                return binarySearchRecursive(arr, l, mid - 1, key);

            return binarySearchRecursive(arr, mid + 1, r, key);
        }
    return false;
    }

}
