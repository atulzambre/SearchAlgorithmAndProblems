package com.search.problems;
/*

An element in a sorted array can be found in O(log n) time via binary search.
But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
Devise a way to find an element in the rotated array in O(log n) time.

*/

public class SearchSortedRotatedProblem {

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};

        int key=2;
        int pivot=findPivot(arr);
        if(binarySearch(arr,0,pivot,key))
            System.out.println("element found");
        else if(binarySearch(arr,pivot+1, arr.length-1,key))
            System.out.println("element found");
        else
            System.out.println("no element found");


    }

    private static boolean binarySearch(int[] arr, int l, int r, int key) {
        if(r>=l) {
            int mid = l + (r - l) / 2;

            if (key == arr[mid])
                return true;
            if (arr[mid] > key)
                return binarySearch(arr, l, mid - 1, key);
            else
               return binarySearch(arr, mid + 1, r, key);
        }
        return false;
    }


    private static int findPivot(int[] arr) {
        int pivot=0;
        for(int i=0,j=1;i<arr.length-1&&j<arr.length;i++,j++){
            if(arr[i]>arr[j]){
                pivot=i;
            }
        }
        return pivot;

    }



}
