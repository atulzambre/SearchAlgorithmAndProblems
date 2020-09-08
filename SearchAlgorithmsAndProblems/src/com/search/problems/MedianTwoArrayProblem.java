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
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        int mergedArray[]=new int[ar1.length*2];
        for(int i=0;i<ar1.length;i++){
            mergedArray[i]=ar1[i];
        }
        for(int i=0;i<ar1.length;i++){
            mergedArray[ar1.length+i]=ar2[i];
        }

        int bubbleSoreted[]=bubbleSort(mergedArray);
        System.out.println(Arrays.toString(bubbleSoreted));

        findMedian(bubbleSoreted);
    }

    private static void findMedian(int[] bubbleSoreted) {
        if(bubbleSoreted.length%2==0){
            int mid=0 + (bubbleSoreted.length-1)/2;

            System.out.println("Median is :"+(bubbleSoreted[mid]+bubbleSoreted[mid+1])/2);
        }
        else{
            int mid=0 + (bubbleSoreted.length-1)/2;
            System.out.println("Median is :"+bubbleSoreted[mid]);
        }
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
