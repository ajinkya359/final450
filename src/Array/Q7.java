package Array;

import MyUtils.ArrayMethods;

public class Q7 {
    public static void main(String[] args) {
        int[] arr= ArrayMethods.takeInput();
        rotate(arr, arr.length);
        ArrayMethods.printArray(arr);
    }
    public static void rotate(int[] arr,int n)
    {
        if(n!=0) {
            int last = arr[arr.length - 1];
            for(int j=n-2;j>=0;j--) arr[j+1]=arr[j];
            arr[0]=last;
        }
    }
}
