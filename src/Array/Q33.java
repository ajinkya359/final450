package Array;

public class Q33 {
	static int minSwap (int arr[], int n, int k) {
		int ans=0;
		int smaller_than_k=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=k) smaller_than_k++;
		}
		int i=0;
		int j=i+smaller_than_k-1;
		int temp=0;
		for(int p=0;p<=j;p++)
		{
			if(arr[p]>k) temp++;
		}
		ans=temp;
		
		while(j<n-1)
		{
			if(arr[i]>k) temp--;
			if(arr[j+1]>k) temp++;
			i++;
			j++;
			ans=Math.min(ans,temp);
		}
		
		return ans;
    }
	
}

