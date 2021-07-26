package Array;

import MyUtils.ArrayMethods;

public class Q5 {
    public static void main(String[] args) {
        int[] arr= ArrayMethods.takeInput();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }
        ArrayMethods.printArray(arr);
    }
}
