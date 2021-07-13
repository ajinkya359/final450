package MyUtils;

import java.util.Scanner;

public class ArrayMethods {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) arr[i]=sc.nextInt();
        sc.close();
        return arr;
    }
    public static void printArray(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++) System.out.print(" "+arr[i]);
        System.out.println();
    }
    public static void reverseArray(int[] arr)
    {
    	int i=0,j=arr.length-1;
    	while(i<j)
    	{
    		int temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		i++;
    		j--;
    	}
    }
    public static void main(String[] args) {
		int[] arr=takeInput();
		reverseArray(arr);
		printArray(arr);
	}
}
