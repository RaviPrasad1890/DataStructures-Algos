package Algos.ArrayBased;

public class MaxSubArraySum {
    /*
    Given an array of +ve and -ve integers, find a contiguous sub array whose sum is max
     */

    public static int maxSubArraySum(int[] a,int size){
        int maxSoFar=0;
        int maxEndingHere=0;
        for(int i=0;i<size;i++){
            maxEndingHere=maxEndingHere+a[i];
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
            if(maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        int[] arr={9,-9,3,4,-15,2,1,9};
        int max=maxSubArraySum(arr,arr.length);
        System.out.println(max);
    }
}
