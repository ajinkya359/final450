package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q13 {
	
	
	static class myCompare implements Comparator<int[]>{
			public int compare(int[] a,int [] b) {
				if(a[0]<b[0])
					return -1;
				else if(a[0]==b[0]&&a[1]<b[1])
					return 1;
				else return 1;
			}
	}
	
	public static int[][] merge(int[][] intervals)
	{
		if(intervals.length==0) {
			int[][] ans=new int[0][0];
			return ans;
		}
		else {
			Arrays.sort(intervals, new myCompare());
			int size=1,last_digit=intervals[0][1];
			for(int i=0;i<intervals.length;i++)
			{
				if(last_digit>=intervals[i][0])
				{
					last_digit=Math.max(intervals[i][1],last_digit);
				}
				else {
					size++;
					last_digit=intervals[i][1];
				}
			}
			int[][] ans=new int[size][2];
			ans[0][0]=intervals[0][0];
			ans[0][1]=intervals[0][1];
			int last_index=0;
			for(int i=0;i<intervals.length;i++)
			{
				if(ans[last_index][1]>=intervals[i][0])
				{
					ans[last_index][1]=Math.max(intervals[i][1],ans[last_index][1]);
				}
				else {
//					for(int j=0;j<last_index;j++)
//					{
//						System.out.print("["+ans[j][0]+","+ans[j][1]+"] ");
//					}
//					System.out.println();
					last_index++;
//					System.out.println(last_index);
					ans[last_index][0]=intervals[i][0];
					ans[last_index][1]=intervals[i][1];
					

				}
			}
			return ans;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		int[][] ans=merge(arr);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println("["+ans[i][0]+","+ans[i][1]+"]");
		}
		sc.close();
		
	}
}
