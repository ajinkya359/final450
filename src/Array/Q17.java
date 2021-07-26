package Array;

import java.util.HashMap;


public class Q17 {
	static int getPairsCount(int[] arr,int n,int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int ans=0;
		for(int i=0;i<n;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int need=k-arr[i];
			map.put(arr[i],map.get(arr[i])-1);
			if(map.get(need)!=null&&map.get(need)>=0)
			{
//				System.out.println(arr[i]+" "+need);
					ans+=map.get(need);
				
			}
		}
		
		
		
		
		
		return ans;
	}
	public static void main(String[] args) {
		int[] arr={1,5,7,1};
		int n=4,k=6;
		System.out.println(getPairsCount(arr, n, k));
	}
}
