package Array;

public class Q22 {
	static int[] garr;
	

	static int findLongestConseqSubseq(int arr[], int n)
	{
		int ans=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) 
			max=Math.max(max, arr[i]);
		garr=new int[max+1];
		for(int i=0;i<=max;i++)
			garr[i]=0;
		for(int i=0;i<n;i++){
			garr[arr[i]]++;
		}
		boolean flag=false;
		int temp=0;
		for(int i=0;i<=max;i++)
		{
			if(garr[i]>0)
			{
				flag=true;
			}
			else {
				flag=false;
				temp=0;
			}
			if(flag)
			{
				temp++;
				ans=Math.max(ans, temp);
			}
			
		}
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
		int n=7;
		int[] a = {1,9,3,10,4,20,2};
		System.out.println(findLongestConseqSubseq(a, n));
	}
}
