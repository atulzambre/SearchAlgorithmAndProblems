package com.search.algorithms;

/*Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

        Examples :

        Input : arr[] = {10, 20, 80, 30, 60, 50,
        110, 100, 130, 170}
        x = 110;
        Output : 6
        Element x is present at index 6

        Input : arr[] = {10, 20, 80, 30, 60, 50,
        110, 100, 130, 170}
        x = 175;
        Output : -1
        Element x is not present in arr[].



        The time complexity of above algorithm is O(n).

        */

public class LinearSearchAlg {

    public static void main(String[] args) {
        int arr[]={10, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int key=110;
        boolean flag=linearSearchalg(arr,key);
        if(flag)
            System.out.println("element found");
        else
            System.out.println("element not found");

    }

    private static boolean linearSearchalg(int[] arr, int key) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return true;
        }
        return false;

    }
}
