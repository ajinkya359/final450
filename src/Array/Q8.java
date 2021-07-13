package Array;

import java.util.Scanner;

public class Q8 {
    public static int maxSubarraySum(int arr[], int n){
        int ans=0;
        int i=0,j=0;
        int temp=0;
        while(j<n&&i<n)
        {
            temp+=arr[j];
            if(temp>ans) ans=temp;
            if(temp<0){
                i=j+1;
                temp=0;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(maxSubarraySum(arr, n));
        sc.close();
    }
}
