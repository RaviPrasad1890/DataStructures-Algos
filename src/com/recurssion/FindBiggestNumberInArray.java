package com.recurssion;

public class FindBiggestNumberInArray {

    static int  highestNumber=Integer.MIN_VALUE;
    public static void main (String[] args){
        int arr[]={4,6,2,81,3,9,12,77};
        int res=Biggestnumber(arr,arr.length-1);
        System.out.println(res);
    }

    public static int Biggestnumber(int[] arr,int size){

        if(size==-1){
            return highestNumber;
        }else{
            if(arr[size]>highestNumber){
                highestNumber=arr[size];
            }
        }
        return Biggestnumber(arr,size-1);
    }
}
