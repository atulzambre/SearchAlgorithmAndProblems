package com.search.problems;
/*
 Given a sorted array arr[] and a number x, write a function that counts
  the occurrences of x in arr[]. Expected time complexity is O(Logn)

two binary search to find first and last occurrences of the element.
need to implement the complete algorithm
*/
public class FrequencyProblem {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int key=1;
        findFrequncy(arr,key);
    }

    private static void findFrequncy(int[] arr, int key) {

         int firstOccur=findFirst(arr,0,arr.length,key);
            int lastOccur=findLast(arr,0,arr.length,key);

        System.out.println("frequency is :"+(lastOccur-firstOccur+1));

    }

    private static int findLast(int[] arr, int l, int r, int key) {

        if(r>l){
            int mid=l+(r-l)/2;
            if(mid==0||key<arr[mid+1]&&arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                return findFirst(arr,mid+1,r,key);
            }
            else{
                return findFirst(arr,l,mid-1,key);
            }
        }
        return -1;

    }

    private static int findFirst(int[] arr, int l, int r, int key) {
        if(r>l){
            int mid=l+(r-l)/2;
            if(mid==0||key>arr[mid-1]&&arr[mid]==key){
        return mid;
            }
            else if(arr[mid]<key){
                return findFirst(arr,mid+1,r,key);
            }
            else{
                return findFirst(arr,l,mid-1,key);
            }
        }
        return -1;

    }
}
