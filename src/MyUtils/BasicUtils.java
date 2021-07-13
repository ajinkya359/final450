package MyUtils;

import java.util.Scanner;

public class BasicUtils {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int takeIntInput()
    {
        Scanner sc=new Scanner(System.in);
        int ans=sc.nextInt();
        sc.close();
        return ans;
    }
}
