package Array;

import java.util.Arrays;

public class Q11 {
	public static void mergeAccepted(int arr1[],int arr2[],int n,int m) {
		//1,10,19,5
		//30,20
		int i=0,j=0,k=n-1;
		while(i<=k&&j<m) {
			if(arr1[i]<arr2[j])
				i++;
			else {
				int temp=arr1[k];
				arr1[k]=arr2[j];
				arr2[j]=temp;
				j++;
				k--;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
}
	
	
	
	public static void merge(int arr1[], int arr2[], int n, int m) {//O(n*m)
        int i=0,j=0;
        while(i<n && j<m) {
        	
        	if(arr1[i]<arr2[j])
        		i++;
        	else {
        		int temp=arr1[i];
        		arr1[i]=arr2[j];
        		arr2[j]=temp;
        		i++;
        		temp=j;
        		while(temp<m&&arr2[temp+1]<arr2[temp])
        		{
        			int temp1=arr2[temp];
        			arr2[temp]=arr2[temp+1];
        			arr2[temp+1]=temp1;
        			temp++;
        		}
        		
        	}
//        	System.out.println("i: "+i+" j: "+j);
//        	
//        	for(int k=0;k<arr1.length;k++)
//    		{
//    			System.out.print(arr1[k]+" ");
//    		}
//        	System.out.println();
//    		for(int k=0;k<arr2.length;k++)
//    		{
//    			System.out.print(arr2[k]+" ");
//    		}
//    		System.out.println("\n-----------------------");
        	
        }
    }
	public static void main(String[] args) {
		int[] arr1= {10,12};
		int[] arr2= {5,18,20};
		mergeAccepted(arr1,arr2,arr1.length,arr2.length);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}
