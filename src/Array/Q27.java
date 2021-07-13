package Array;

public class Q27 {
	static int trappingWater(int[] arr,int n)
	{
		int ans=0;
		int[] left=new int[n];
		left[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1], arr[i]);
		}
		int[] right=new int[n];
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1],arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			ans+=Math.min(left[i],right[i])-arr[i];
		}
		
		
		return ans;
		
	}
	public static void main(String[] args) {
		int N = 6;
		int[] arr = {3,0,0,2,0,4};
		System.out.println(trappingWater(arr, N));
	}
}
