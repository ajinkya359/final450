package Array;

import MyUtils.ArrayMethods;
import MyUtils.MergeSort;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[] arr= ArrayMethods.takeInput();
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println("K smallest: "+arr[k-1]);
        System.out.println("K largest: "+arr[arr.length-1-k]);
        sc.close();
    }
}
