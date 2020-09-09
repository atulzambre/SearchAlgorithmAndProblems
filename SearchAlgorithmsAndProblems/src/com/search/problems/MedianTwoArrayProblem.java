package com.search.problems;
/*
There are 2 sorted arrays A and B of size n each.
Write an algorithm to find the median of the array obtained after merging the above 2 arrays(i.e. array of length 2n).
 The complexity should be O(log(n)).
        median-of-two-arrays
*/


import java.util.Arrays;

public class MedianTwoArrayProblem {
    public static void main(String[] args) {
        int ar1[] = {1, 2};
        int ar2[] = {3,4};

        int mergedArray[]=new int[ar1.length+ar2.length];
        for(int i=0;i<ar1.length;i++){
            mergedArray[i]=ar1[i];
        }
        for(int i=0;i<ar2.length;i++){
            mergedArray[ar1.length+i]=ar2[i];
        }

//        int bubbleSoreted[]=bubbleSort(mergedArray);
        int bubbleSoreted;
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));

        System.out.println(findMedian(mergedArray));
    }

    private static double findMedian(int[] bubbleSoreted) {
        double mid;
        if(bubbleSoreted.length%2==0){
            int pivot=bubbleSoreted.length/2;

             mid=(double)(bubbleSoreted[pivot-1]+bubbleSoreted[pivot])/2;
        }
        else{
            mid= bubbleSoreted[(bubbleSoreted.length-1)/2];
        }
        return mid;
    }

    private static int[] bubbleSort(int[] mergedArray) {
        for(int k=0;k<mergedArray.length;k++) {
            for (int i = 0, j = 1; i < mergedArray.length && j < mergedArray.length; i++, j++) {
                if (mergedArray[i] > mergedArray[j]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }
        return mergedArray;
    }


}
