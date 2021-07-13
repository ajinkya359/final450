package Array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        reverse(arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
        sc.close();
        
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
