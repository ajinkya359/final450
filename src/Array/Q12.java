package Array;

import java.util.Scanner;

public class Q12 {
	
	public static int maxSubarraySum(int[] arr,int n) {
		int temp=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			temp+=arr[i];
			if(temp>=ans) {
				ans=temp;
			}
			if(temp<0) temp=0;
			
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(n);
	}
}
