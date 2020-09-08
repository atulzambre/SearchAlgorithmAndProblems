package com.search.algorithms;
/*
Let’s consider the following array: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610). Length of the array is 16. Jump search will find the value of 55 with the following steps assuming that the block size to be jumped is 4.
        STEP 1: Jump from index 0 to index 4;
        STEP 2: Jump from index 4 to index 8;
        STEP 3: Jump from index 8 to index 12;
        STEP 4: Since the element at index 12 is greater than 55 we will jump back a step to come to index 8.
        STEP 5: Perform linear search from index 8 to get the element 55.

        Time Complexity : O(√n)
        Auxiliary Space : O(2)

*/


public class JumpSearchAlg {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100,101};


        int key=101;

        boolean flag=jumpSearchIterative(arr,0,arr.length-1,key);
        if (flag)
            System.out.println("element present");
        else
            System.out.println("element not present");
    }

    private static boolean jumpSearchIterative(int[] arr, int l, int r, int key) {
        int step= (int) Math.floor(Math.sqrt(arr.length));
        int finalStep=0;
        for(int i=0;i<=r;i=i+3){
            if(key==arr[i]){
                return true;
            }
            else if(key<arr[i]){
                for(int j=i-3;j<i;j++){
                    if(key==arr[j])
                        return true;
                }
            }
            finalStep=i;
        }

        for(int j=finalStep;j<=r;j++){
            if(key==arr[j])
                return true;
        }
        return false;
    }
}
