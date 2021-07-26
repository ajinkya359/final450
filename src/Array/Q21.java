package Array;

public class Q21 {
	static long maxProduct(int[] arr,int n)
	{
		int ans=0;
		int max_positive=1;
		int all=1;
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				max_positive=1;
				all=1;
			}
			else if(arr[i]>0)
			{
				if(flag)
				{
					max_positive=max_positive*arr[i];
				}
				else {
					max_positive=arr[i];
					ans=Math.max(ans, max_positive);
				}
				all=all*arr[i];
			}
			else {
				
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr= {0, 3, -5, -2, 8 ,-7 ,-6 ,-2, -3, -9};
		System.out.println(maxProduct(arr, arr.length));
	}

}
