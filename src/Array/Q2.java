package Array;

import MyUtils.ArrayMethods;

public class Q2 {
    public static void main(String[] args) {
        int[] arr= ArrayMethods.takeInput();
        minmax(arr);
    }
    static void minmax(int[] arr){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("Max: "+ max+" Min: "+min);
        
    }
}
