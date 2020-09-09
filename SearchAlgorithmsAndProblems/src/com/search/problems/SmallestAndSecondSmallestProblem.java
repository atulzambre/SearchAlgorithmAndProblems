package com.search.problems;

public class SmallestAndSecondSmallestProblem {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34,1};
        twoSmallestNumbers(arr);
    }

    private static void twoSmallestNumbers(int[] arr) {
        int fNum=Integer.MAX_VALUE;
        int sNum=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if(fNum>arr[i]){
                sNum=fNum;
                fNum=arr[i];

            }

            else if(sNum>arr[i] && arr[i]!=fNum){
                sNum=arr[i];
            }

        }
        System.out.println("first number is :"+fNum+" second number is:"+sNum);
    }
}
