package Algos.ArrayBased;

public class RotationOfArray {
    //Given an array, rotate it to given number of rotation
    /*
    I/P: array=[1,2,3,4,5,6,7]
    I/P: NoOfRotaion:2-->k
    O/P:[3,4,5,6,7,1,2]
     */

    public static void main(String[] args){
        int array[]={1,2,3,4,5,6,7};
        int size=7;
        int k=2;
        rotateArray(array,k,size);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void rotateArray(int[] array,int k,int size){
        reverseArray(array,0,k-1);//Reverse first half of array[2,1,3,4,5,6,7]

        reverseArray(array,k,size-1);//Reverse 2nd half of array[2,1,7,6,5,4,3]
        reverseArray(array,0,size-1);//Reverse whole array[3,4,5,6,7,1,2]
    }
    public static void reverseArray(int[] array,int start, int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
}
