package Array;

public class Q15 {
	static long inversionCount(long[] arr,long n)
	{
		long ans=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					ans++;
			}
		}
		return ans;
	}
	
	static long helper(long[] arr,int start,int last)
	{
		if(start<last) {
		int mid=(start+last)/2;
		long left_inv=helper(arr,start,mid);
		long right_inv=helper(arr,mid+1,last);
		
		int i=start,j=mid+1;
		long current_inv=0;
		long[] temp=new long[last-start+1];
		int k=0;
		while(i<=mid&&j<=last)
		{
			if(arr[i]<=arr[j])
			{
				temp[k++]=arr[i++];
			}
			else {
				current_inv+=mid-i+1;
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) 
			temp[k++]=arr[i++];
		
		while(j<=last) 
			temp[k++]=arr[j++];
		for(i=start,k=0;i<=last;i++,k++)
		{
			arr[i]=temp[k];
		}
		
		return left_inv+right_inv+current_inv;
	}
		else return 0;
	}
	static long inversionCountAccepted(long[] arr,long n) {
		if(n==0) return 0;
		else {
			long ans=helper(arr,0,arr.length-1);
			return ans;
		}
	}
	public static void main(String[] args) {
		long[] arr= {2, 4, 1, 3, 5};
		long ans=inversionCountAccepted(arr, 5);
		System.out.println(ans);
	}
}
